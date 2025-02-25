package javacore.chapter02.condition.exercise;

public class FrenchRevenueTaxCalculator {
    public static void main(String[] args) {
        double salary = 1000000;
        double abattement =salary -( salary * 0.10);
        double initialSalaryOfComparaison = abattement;
        double trancheImposable = 0;
        double soldImpot =0 ;
        double countImpot= 0;

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


         if(abattement > 177106 ){
             trancheImposable =  (abattement - 177106) ;
             soldImpot =  (trancheImposable* 0.45);
             abattement = abattement - trancheImposable;
             countImpot += soldImpot;

             System.out.println(countImpot  +" le cumule des  impots paye ");
             System.out.println(soldImpot +" impot paye par tranche");
             System.out.println(abattement+"euros 45%");
             System.out.println("--------------------------");
         }
         if(abattement <= 177106 &&  abattement >=  82342 ){
             trancheImposable =  (abattement - 82342) ;
             soldImpot =  (trancheImposable* 0.41);
             abattement = abattement - trancheImposable;
             countImpot += soldImpot;

             System.out.println(countImpot  +" le cumule des  impots paye ");
             System.out.println(soldImpot +" impot paye par tranche");

             System.out.println(abattement+"euros 30%");
             System.out.println("--------------------------");
         }
        if(abattement <= 82342 &&  abattement >=  28798  ){
            trancheImposable =  (abattement - 28798) ;
            soldImpot =  (trancheImposable* 0.30);
            abattement = abattement - trancheImposable;
            countImpot += soldImpot;

            System.out.println(countImpot  +" le cumule des  impots paye ");
            System.out.println(soldImpot+" impot paye par tranche");
            System.out.println(abattement+"euros 30%");
            System.out.println("--------------------------");
        }
        if(abattement <= 28798 &&  abattement >= 11295   ){
            trancheImposable =  (abattement - 11295) ;
            soldImpot =  (trancheImposable* 0.11);
            abattement = abattement - trancheImposable;
            countImpot += soldImpot;

            System.out.println(countImpot +" le cumule des  impots paye " );
            System.out.println(soldImpot);
            System.out.println(abattement+"euros 11%");
            System.out.println("--------------------------");
        }
        if(abattement <= 11295 &&  abattement >=  0  ){

            System.out.println("tu ne payes pas d'impot sur le revenu sur cette tranche");
            System.out.println("--------------------------");
        }
        System.out.println(countImpot +" euros total paye des  impots paye " );
        System.out.println("le pourcentage d'impot paye en total "+((countImpot/initialSalaryOfComparaison)*100) +"%");









    }
}