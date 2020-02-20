/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliares;

/**
 *
 * @author tux
 */
public class Varias {
  
  
  // BATERÍA DE FUNCIONES AUXILIARES
  
  public static int CoeficienteSiglo(int anio) {
    // coeficiente siglo
    int coeficSiglo;

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
    return coeficSiglo;
  }

  public static int CoeficienteAnio (int anio) {
  //coeficiente año
    int coeficAnio;
    coeficAnio = anio % 100;
    coeficAnio += coeficAnio/4;
    return coeficAnio;
  }
  
  public static int CoeficienteBisiesto (int anio, int mes) {
    //coeficiente bisiesto  
    int coeficBisiesto;
    if ((((anio % 4 == 0) && (anio % 100 !=0)) || (anio % 400 == 0)) && (mes>=1) && (mes<=2)){
      coeficBisiesto = -1;
    } else {
      coeficBisiesto = 0;
    }
    return coeficBisiesto;
  }

  public static int CoeficienteMes (int mes) {
    int coeficMes=-1000;
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
    return coeficMes;
  }

  public static int DiaDeLaSemana (int dia, int mes, int anio) {
    // 0: domingo 1: lunes 2: martes ... 
    int coeficSiglo;
    int coeficAnio;
    int coeficBisiesto;
    int coeficMes;
    int coeficDia;
    int coeficGlobal;

      
    coeficSiglo = CoeficienteSiglo(anio);    
    coeficAnio = CoeficienteAnio(anio);
    coeficBisiesto = CoeficienteBisiesto(anio,mes);
    coeficMes = CoeficienteMes(mes);
    // valor coeficiente día
    coeficDia = dia;
    // sumamos y hacemos resto div. 7   
    
    coeficGlobal = coeficSiglo + coeficAnio + coeficBisiesto + coeficMes + coeficDia;
    coeficGlobal %= 7;
    coeficGlobal = (coeficGlobal + 7 -1) %7;
    return coeficGlobal;
  }


  
}
