package entities;

import java.util.ArrayList;
import java.util.List;

public class MasterTraining {

    private List<Plan> plans;

    public MasterTraining() {
        this.plans = new ArrayList<>();
    }

    /**
     * Determina para un plan específico el rendimiento del corazón del ciclista.
     * Si el corazón presenta latidos irregulares, crea un nuevo plan de tipo “Heart Care” para dicho ciclista.
     *<p>
     *     Si el promedio de beats es menos a 90 o mayor a 160, se considera un ritmo irregular
     *</p>
     * Documentacion del Invariante
     *
     * @param number El numero del plan a verificar
     * @return Plan: El nuevo plan creado en caso de necesitarlo, de lo contrario null.
     */
    public Plan checkHeart(long number) {

        Plan result = null;
        Plan p = findPlan(number);

        double pab = p.averageBeats();

        if (pab < 90 || pab > 160) {
            result = new Plan("H", p.getCyclist());
            addPlan(result);
        }
        return result;
    }

    /**
     * Encuentra un plan dado su id.
     * Si el plan no existe retorna null.
     *
     * @param number
     * @return
     */
    private Plan findPlan(long number){
        Plan result = null;
        for(int i = 0; i < this.plans.size(); i++){
            if(this.plans.get(i).getNumber()==number)
                result = this.plans.get(i);
        }
        return result;
    }

    public void addPlan(Plan plan) {
        this.plans.add(plan);
    }

    public int countPlans() {
        return this.plans.size();
    }
}
