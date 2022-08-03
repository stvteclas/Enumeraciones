package test;
import enumeracion.Dias;

import java.sql.Date;
import java.util.Calendar;

public class TestEnumeraciones {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        int diaSemana = c.get(Calendar.DAY_OF_WEEK);
        if (diaSemana== 1 ){
            indicarDiaSemana(Dias.LUNES);
        }
        if(diaSemana==2){
            indicarDiaSemana(Dias.MARTES);
        }
        if(diaSemana==3){
            indicarDiaSemana(Dias.MIERCOLES);
        }
        if (diaSemana==4){
            indicarDiaSemana(Dias.JUEVES);
        }
        if(diaSemana==5){
            indicarDiaSemana(Dias.VIERNES);
        }
        if(diaSemana==6){
            indicarDiaSemana(Dias.SABADO);
        }
        if(diaSemana==7){
            indicarDiaSemana(Dias.DOMINGO);
        }
    }

    private static void indicarDiaSemana(Dias dias){
        switch (dias){
            case LUNES :
                System.out.println("Primer dia de la semana " +Dias.LUNES);
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana " +Dias.MARTES);
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana " +Dias.MIERCOLES);
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana " +Dias.JUEVES);
                break;
            case VIERNES:
                System.out.println("Quinto de la semana " +Dias.VIERNES);
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana " +Dias.SABADO);
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana " +Dias.DOMINGO);
                break;
        }
    }
}
