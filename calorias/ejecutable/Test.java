package ejecutable;

import javax.swing.JOptionPane;

public class Test
{
    public static void main(String[] args) {
        /**utilizar el tipo arreglo para configurar las calorias gastadas
         * por una persona a lo largo de la semana
         */




        int n=1;
        int[] numeros = new int[7];


        int n1=numeros[0] = Integer.parseInt(JOptionPane.showInputDialog("ingrese las calorias del dia "+1+" de la semana: "));
        int n2=numeros[1] = Integer.parseInt(JOptionPane.showInputDialog("ingrese las calorias del dia "+2+" de la semana: "));
        int n3=numeros[2] = Integer.parseInt(JOptionPane.showInputDialog("ingrese las calorias del dia "+3+" de la semana: "));
        int n4=numeros[3] = Integer.parseInt(JOptionPane.showInputDialog("ingrese las calorias del dia "+4+" de la semana: "));
        int n5=numeros[4] = Integer.parseInt(JOptionPane.showInputDialog("ingrese las calorias del dia "+5+" de la semana: "));
        int n6=numeros[5] = Integer.parseInt(JOptionPane.showInputDialog("ingrese las calorias del dia "+6+" de la semana: "));
        int n7=numeros[6] = Integer.parseInt(JOptionPane.showInputDialog("ingrese las calorias del dia "+7+" de la semana: "));

        int w = n1+n2+n3+n4+n5+n6+n7;
        int o = w/7;

        
        for(int i=0;i<7;i++){
            System.out.println("día numero: "+n);
            System.out.println(numeros[i]+" 5calorias");
            n=n+1;
        }

        //hallas el dia que se consumio mas calorias

        if(n1>n2){
            if(n1>n3){
                if(n1>n4){
                    if(n1>n5){
                        if(n1>n6){
                            if(n1>n7){
                                System.out.println("se consumio mas calorias el dia: 1 con un total de: "+n1);
                            }else{
                                System.out.println("se consumio mas calorias el dia: 7 con un total de: "+n7);
                            }
                        }if(n6>n7){
                            System.out.println("se consumio mas calorias el dia: 6 con un total de: "+n6);
                        }
                    }if(n5>n6){
                        if(n5>n7){
                            System.out.println("se consumio mas calorias el dia: 5 con un total de: "+n5);
                        }else{
                            System.out.println("se consumio mas calorias el dia: 7 con un total de: "+n7);
                        }
                    }if(n6>n7){
                        System.out.println("se consumio mas calorias el dia: 6 con un total de: "+n6);
                    }else{
                        System.out.println("se consumio mas calorias el dia: 7 con un total de: "+n7);
                    }
                }if(n4>n5){
                    if(n4>n6){
                        if(n4>n7){
                            System.out.println("se consumio mas calorias el dia: 4 con un total de: "+n4);
                        }else{
                            System.out.println("se consumio mas calorias el dia: 7 con un total de: "+n7);
                        }
                    }if(n6>n7){
                        System.out.println("se consumio mas calorias el dia: 6 con un total de: "+n6);
                    }else{
                        System.out.println("se consumio mas calorias el dia: 7 con un total de: "+n7);
                    }
                }if(n5>n6){
                    if(n5>n7){
                        System.out.println("se consumio mas calorias el dia: 5 con un total de: "+n5);
                    }else{
                        System.out.println("se consumio mas calorias el dia: 7 con un total de: "+n7);
                    }
                }
                if(n6>n7){
                    System.out.println("se consumio mas calorias el dia: 1 con un total de: "+n1);
                }else{
                    System.out.println("se consumio mas calorias el dia: 7 con un total de: "+n7);
                }
            }if(n3>n4){
                if(n3>n5){
                    if(n3>n6){
                        if(n3>n7){
                            System.out.println("se consumio mas calorias el dia: 3 con un total de: "+n4);
                        }else{
                            System.out.println("se consumio mas calorias el dia: 7 con un total de: "+n7);
                        }
                    }if(n6>n7){
                        System.out.println("se consumio mas calorias el dia: 6 con un total de: "+n6);
                    }else{
                        System.out.println("se consumio mas calorias el dia: 7 con un total de: "+n7);
                    }
                }if(n5>n6){
                    if(n5>n7){
                        System.out.println("se consumio mas calorias el dia: 5 con un total de: "+n5);
                    }else{
                        System.out.println("se consumio mas calorias el dia: 7 con un total de: "+n7);
                    }
                }if(n6>n7){
                    System.out.println("se consumio mas calorias el dia: 6 con un total de: "+n6);
                }
            }if(n4>n5){
                if(n4>n6){
                    if(n4>n7){
                        System.out.println("se consumio mas calorias el dia: 4 con un total de: "+n4);
                    }else{
                        System.out.println("se consumio mas calorias el dia: 7 con un total de: "+n7);
                    }   
                }if(n6>n7){
                    System.out.println("se consumio mas calorias el dia: 6 con un total de: "+n6);
                }else{
                    System.out.println("se consumio mas calorias el dia: 7 con un total de: "+n7);
                }
            }if(n5>n6){
                if(n5>n7){
                    System.out.println("se consumio mas calorias el dia: 6 con un total de: "+n6);
                }else{
                    System.out.println("se consumio mas calorias el dia: 7 con un total de: "+n7);
                }
            }if(n6>n7){
                System.out.println("se consumio mas calorias el dia: 16 con un total de: "+n6);
            }else{
                System.out.println("se consumio mas calorias el dia: 7 con un total de: "+n7);
            }
        
        System.out.println("total caloridas quemadas:" +w);
        System.out.println("total promedio de calorias por dia:" +o);
        
        System.exit(0);




    }
}
}