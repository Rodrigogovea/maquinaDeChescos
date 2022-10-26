import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;
public class main
{
    public static void main(String []args)
    {
        int cocas = 10;
        int frescas = 10;
        int fantas = 10;
        int precio_coca = 18;
        int precio_fresca = 15;
        int precio_fanta = 12;
        short opc = 0;
        short monedas = 0;
        short opcMoneda;
        Scanner lector = new Scanner(System.in);

        do
        {
            System.out.println("Seleccion una opcion: ");
            System.out.println("______________________________");
            System.out.println("Refrescos disponibles: ");
            System.out.println("1.- Coca Cola -->" + cocas + " Disponibles");
            System.out.println("2.- Fresca -->" + frescas + " Disponibles");
            System.out.println("3.- Fanta -->" + fantas + " Disponibles");
            System.out.println("4.- Salir");
            System.out.println("______________________________");
            opc = lector.nextShort();

            switch(opc)
            {
                case 1:
                    if(cocas>0)
                    {
                        System.out.println("Favor de insertar las monedas");
                        while(monedas<precio_coca)
                        {
                            System.out.println("Monedas aceptadas: $1, $2, $5, $10 y $20");
                            System.out.println("Haz depositado: $" + monedas + " --> Precio: $" + precio_coca);
                            opcMoneda = lector.nextShort();
                            switch(opcMoneda)
                            {
                                case 1:
                                    monedas+=1;
                                break;
                                case 2:
                                    monedas+=2;
                                break;
                                case 5:
                                    monedas+=5;
                                break;
                                case 10:
                                    monedas+=10;
                                break;
                                case 20:
                                    monedas+=20;
                                break;
                                default:
                                    System.out.println("No disponible");
                                break;
                            }
                        }
                        System.out.println("Total depositado: $" + monedas);
                        System.out.println("Despachando una coca! ");
                        cocas--;
                        if(monedas>precio_coca)
                        {
                            monedas-=precio_coca;
                            System.out.println("Tome su cambio: $" + monedas);
                            monedas = 0;
                        }
                    monedas = 0;
                    }
                    else
                    {
                        System.out.println("Lo siento no hay más producto!");
                    }
                break;
                case 2:
                    if(frescas>0)
                    {
                        System.out.println("Favor de insertar las monedas");
                        while(monedas<precio_fresca)
                        {
                            System.out.println("Monedas aceptadas: $1, $2, $5, $10 y $20");
                            System.out.println("Haz depositado: $" + monedas + " -->Precio: $" + precio_fresca);
                            opcMoneda = lector.nextShort();
                            switch(opcMoneda)
                            {
                                case 1:
                                    monedas+=1;
                                break;
                                case 2:
                                    monedas+=2;
                                break;
                                case 5:
                                    monedas+=5;
                                break;
                                case 10:
                                    monedas+=10;
                                break;
                                case 20:
                                    monedas+=20;
                                break;
                                default:
                                    System.out.println("No disponible");
                                break;
                            }
                        }
                        System.out.println("Se depositó: " + monedas);
                        System.out.println("Despachando una Fresca! ");
                        frescas--;
                        if(monedas>precio_fresca)
                        {
                            monedas-=precio_fresca;
                            System.out.println("Tome su cambio: $" + monedas);
                            monedas = 0;
                        }
                    monedas = 0;
                    }
                    else
                    {
                        System.out.println("Lo siento no hay más producto!");
                    }
                break;
                case 3:
                    if(fantas>0)
                    {
                        System.out.println("Favor de insertar las monedas");
                        while(monedas<precio_fanta)
                        {
                            System.out.println("Monedas aceptadas: $1, $2, $5, $10 y $20");
                            System.out.println("Haz depositado: $" + monedas + " --> Precio: $" + precio_fanta);
                            opcMoneda = lector.nextShort();
                            switch(opcMoneda)
                            {
                                case 1:
                                    monedas+=1;
                                break;
                                case 2:
                                    monedas+=2;
                                break;
                                case 5:
                                    monedas+=5;
                                break;
                                case 10:
                                    monedas+=10;
                                break;
                                case 20:
                                    monedas+=20;
                                break;
                                default:
                                    System.out.println("No disponible");
                                break;
                            }
                        }
                        System.out.println("Despachando una coca! ");
                        fantas--;
                        if(monedas>precio_fanta)
                        {
                            monedas-=precio_fanta;
                            System.out.println("Tome su cambio: $" + monedas);
                            monedas = 0;
                        }
                    monedas = 0;
                    }
                    else
                    {
                        System.out.println("Lo siento no hay más producto!");
                    }
                break;
                case 4:
                    System.out.println("Adios!!!!");
                break;
                default:
                    System.out.println("Opción no disponible!");
                break;
            }

        }while(opc!=4);
    }
}