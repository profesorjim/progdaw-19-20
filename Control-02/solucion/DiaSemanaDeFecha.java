import java.util.Scanner;

public class DiaSemanaDeFecha {
  public static void main (String[] args) {
    int dia;
    int mes;
    int anio;
    
    int coeficSiglo;
    int coeficAnio;
    int coeficBisiesto;
    int coeficMes;
    int coeficDia;
    
    int resultado;
    String resultadoTexto="";
    
    
    
    Scanner x = new Scanner (System.in);
    
    System.out.println("Este programa calcula el día de la semana que corresponde a una fecha.");
    System.out.println("Válido para fechas comprendidas entre 1/1/1700 y 31/12/2299");
    System.out.print("Introduzca fecha, indicando día, mes y año (dd mm aaaa): ");
    
    dia = x.nextInt();
    mes = x.nextInt();
    anio = x.nextInt();
    x.nextLine();
    
    
    // coeficiente siglo
    if (anio < 1800) {
      coeficSiglo = 5;
    } else if (anio < 1900) {
      coeficSiglo = 3;
    } else if (anio < 2000) {
      coeficSiglo = 1;
    } else if (anio < 2100) {
      coeficSiglo = 0;
    } else if (anio < 2200) {
      coeficSiglo = -2;
    } else {
      coeficSiglo = -4;
    }
    
    //coeficiente año
    coeficAnio = anio % 100;
    coeficAnio += coeficAnio/4;
    
    //coeficiente bisiesto
    if ((((anio % 4 == 0) && (anio % 100 !=0)) || (anio % 400 == 0)) && (mes>=1) && (mes<=2)){
      coeficBisiesto = -1;
    } else {
      coeficBisiesto = 0;
    }

    
    
    coeficMes=-1000;
    //coeficiente mes
    switch (mes) {
      case 1:
      case 10:
        coeficMes = 6;
        break;
      case 2:
      case 3:
      case 11:
        coeficMes = 2;
        break;
      case 4:
      case 7:
        coeficMes = 5;
        break;
      case 5:
        coeficMes = 0;
        break;
      case 6:
        coeficMes = 3;
        break;
      case 8:
        coeficMes = 1;
        break;
      case 9:
      case 12:
        coeficMes = 4;
        break;
      default:
    }
    
    // valor coeficiente día
    coeficDia = dia;
    
    // sumamos y hacemos resto div. 7
    
    resultado = coeficSiglo + coeficAnio + coeficBisiesto + coeficMes + coeficDia;
    resultado %= 7;
    
    switch (resultado) {
      case 1:
        resultadoTexto = "Lunes";
        break;
      case 2:
        resultadoTexto = "Martes";
        break;
      case 3:
        resultadoTexto = "Miércoles";
        break;
      case 4:
        resultadoTexto = "Jueves";
        break;
      case 5:
        resultadoTexto = "Viernes";
        break;
      case 6:
        resultadoTexto = "Sábado";
        break;
      case 0:
        resultadoTexto = "Domingo";
      default:
    }
    
    System.out.println("La fecha "+dia+"/"+mes+"/"+anio+" cae en: "+resultadoTexto);
  }
}
