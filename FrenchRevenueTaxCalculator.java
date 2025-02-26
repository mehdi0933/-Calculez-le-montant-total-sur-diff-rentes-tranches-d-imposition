package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {
    public static void main(String[] args) {
        // value to be tested : 10000 / 25000 / 50000 / 100000 / 250000
        double taxableNetSalary = 1000000;
        // annual french abattement 10% net imposable salary
        double taxableBaseReduced = taxableNetSalary - (taxableNetSalary * 0.10);
        double taxableBase = taxableBaseReduced;
        double trancheImposable = 0;
        double soldImpot = 0 ;
        double countImpot = 0;

/**
         * De 0€ à 11.294€ _______ : 0%
         *
         * De 11.295€ à 28.797€ __ : 11%
         *
         * De 28.798€ à 82.341€ _ : 30%
         *
         * De 82.342€ à 177.106€ _ : 41%
         *
         * Supérieur à 177.106€ ___ : 45%
         */


         if(taxableBaseReduced > 177106 ){
             trancheImposable =  (taxableBaseReduced - 177106) ;
             soldImpot =  (trancheImposable* 0.45);
             taxableBaseReduced = taxableBaseReduced - trancheImposable;
             countImpot += soldImpot;
             System.out.println("NOM_FICHE : FrenchRenueTaxCalculator - Fianacial Module Taxe - tranche > 177106 (45%) "+ trancheImposable+" euros / impot : "+soldImpot+" euros");
             System.out.println("--------------------------");
         }
         if(taxableBaseReduced <= 177106 &&  taxableBaseReduced >=  82342 ){
             trancheImposable =  (taxableBaseReduced - 82342) ;
             soldImpot =  (trancheImposable* 0.41);
             taxableBaseReduced = taxableBaseReduced - trancheImposable;
             countImpot += soldImpot;
             System.out.println("NOM_FICHE : FrenchRenueTaxCalculator - Fianacial Module Taxe - tranche <  177106 (41%) "+ trancheImposable+" euros / impot : "+soldImpot+" euros");
             System.out.println("--------------------------");
         }
        if(taxableBaseReduced <= 82342 &&  taxableBaseReduced >=  28798  ){
            trancheImposable =  (taxableBaseReduced - 28798) ;
            soldImpot =  (trancheImposable* 0.30);
            taxableBaseReduced = taxableBaseReduced - trancheImposable;
            countImpot += soldImpot;

            System.out.println("NOM_FICHE : FrenchRenueTaxCalculator tranche - Fianacial Module Taxe - < 82342 (30%) "+ trancheImposable+" euros / impot : "+soldImpot+" euros");

            System.out.println("--------------------------");
        }
        if(taxableBaseReduced <= 28798 &&  taxableBaseReduced >= 11295   ){
            trancheImposable =  (taxableBaseReduced - 11295) ;
            soldImpot =  (trancheImposable* 0.11);
            taxableBaseReduced = taxableBaseReduced - trancheImposable;
            countImpot += soldImpot;

            System.out.println("NOM_FICHE : FrenchRenueTaxCalculator - Fianacial Module Taxe - tranche < 28798 (11%) "+ trancheImposable+" euros / impot : "+soldImpot+" euros");

            System.out.println("--------------------------");
        }
        if(taxableBaseReduced <= 11295 &&  taxableBaseReduced >=  0  ){

            System.out.println("NOM_FICHE : FrenchRenueTaxCalculator - Fianacial Module Taxe - tu ne payes pas d'impot sur le revenu sur cette tranche");
            System.out.println("--------------------------");
        }
        System.out.println("NOM_FICHE : FrenchRenueTaxCalculator - Fianacial Module Taxe - countImpot" +" euros total paye des  impots paye " );
        System.out.println("NOM_FICHE : FrenchRenueTaxCalculator - Fianacial Module Taxe - le pourcentage d'impot paye en total "+((countImpot/taxableBase)*100) +"%");









    }
}