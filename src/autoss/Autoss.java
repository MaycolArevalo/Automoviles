/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoss;

import java.util.Scanner;

/**
 *
 * @author Maycol
 */
public class Autoss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Scanner gama = new Scanner (System.in);
        Scanner gam1 = new Scanner (System.in);
        Scanner Ame = new Scanner (System.in);
        
        
        int transmision,colorexterno,colortapiceria,aro,accesorioexterno = 0,accesoriointerno,accesorioelectronico;
        String amenidades = null;
        
        int tipam, preciotransmision;
        
        int g, ingresar;
        int salir;
        
        //variables para las amenidades de color
        int preciocolorexterno;
        String gam = null, tipotransmision;
        String tipocolorexterno;
        
        //variables para las amenidades de Aros
        int precioaro;
        String tipoaro;
        
        //variables para las amenidades de Accesorios Externos
        int preciodeaccesoriosexternos;
       String tipoaccesoriosexternos = null;
        
        //variables para las amenidades de Accesorios Interiores
       int preciodeaccesoriosinterno;
       String tipoaccesoriosinterno;
       
       //variables para las amenidades de Accesorios Electronicas
       int preciodeaccesorioselectronico;
       String tipoaccesoriosinternoelectronico;
       
       tipam = 7;
        
   
       System.out.println("                 Menú Principal");
       System.out.println("1.- seleccionar Automóvil");
       System.out.println("2.- Salir");
        ingresar = leer.nextInt();
        g = 0;

if (ingresar==1) {
			System.out.println("                Seleccion de gama de vehículo");
			System.out.println("1.- SedámEcconómico");
			System.out.println("2.- Sedán");
			System.out.println("3.- Deportivo");
			System.out.println("4.- Híbrido");
			System.out.println("5.- Coupe");
			System.out.println("6.- Coupe Deportivo");
			System.out.println("7.- Compacto");
			System.out.println("8.- Hatchback");
			System.out.println("9.- Económico versión Rally");
			System.out.println("10.- Regresar a menu principal");
			System.out.println("Ingrese la gama de vehículo: ");
			g = gama.nextInt();
		} 
while (tipam==7) {
			tipam = 0;
                        while (g==10){
                        
                            System.out.println("                    menú principal");
			System.out.println("1.- seleccionar Automóvil");
			System.out.println("2.- Salir");
			ingresar = leer.nextInt();
			
			g = 0;
			if (ingresar==1) {
				System.out.println("                Seleccion de gama de vehículo");
				System.out.println("1.- Sedám Económico");
				System.out.println("2.- Sedán");
				System.out.println("3.- Deportivo");
				System.out.println("4.- Híbrido");
				System.out.println("5.- Coupe");
				System.out.println("6.- Coupe Deportivo");
				System.out.println("7.- Compacto");
				System.out.println("8.- Hatchback");
				System.out.println("9.- Económico versión Rally");
				System.out.println("10.- Regresar a menu principal");
				System.out.println("Ingrese la gama de vehículo: ");
				g = gama.nextInt();
			} 
                            }
                        
                        
                        if (g==1) {
				g = 0;
				g = 18940;
				System.out.println("Escogio: Sedán Económico de "+g+" dólares");
				gam = "Sedám Económico";
			} else {
				if (g==2) {
					g = 0;
					g = 23570;
					System.out.println("Escogio: Sedán "+g+" dólares");
					gam = "Sedám";
				} else {
					if (g==3) {
						g = 0;
						g = 24100;
						System.out.println("Escogio: Deportivo de "+g+" dólares");
						gam = "Deportivo";
					} else {
						if (g==4) {
							g = 0;
							g = 25100;
							System.out.println("Escogio: Híbrido de "+g+" dólares");
							gam = "Híbrido";
						} else {
							if (g==5) {
								g = 0;
								g = 19350;
								System.out.println("Escogio: Coupe de "+g+" dólares");
								gam = "Coupe";
							} else {
								if (g==6) {
									g = 0;
									g = 24100;
									System.out.println("Escogio: Coupe Deportivo de "+g+" dólares");
									gam = "Coupe Deportivo";
								} else {
									if (g==7) {
										g = 0;
										g = 16190;
										System.out.println("Escogio: Compacto de "+g+" dólares");
										gam = "Compacto";
									} else {
										if (g==8) {
											g = 0;
											g = 20150;
											System.out.println("Escogio: Hatchback de "+g+" dólares");
											gam = "Hatchback";
										} else {
											if (g==9) {
												g = 0;
												g = 34700;
												System.out.println("Escogio: Económico versión Rally de "+g+" dólares");
												gam = "Económico versión Rally";
											} else {
												if (g==10) {
													g = 0;
													g = 10;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
                        if (g==18940) {
				g = 1;
			}
			if (g==23570) {
				g = 2;
			}
			if (g==24100) {
				g = 3;
			}
			if (g==25100) {
				g = 4;
			}
			if (g==19350) {
				g = 5;
			}
			if (g==24100) {
				g = 6;
			}
			if (g==16190) {
				g = 7;
			}
			if (g==20150) {
				g = 8;
			}
			if (g==34700) {
				g = 9;
			}
                        
                        if (ingresar==2) {
				System.out.println("Gracias :)");
			} else {
				if (g<=9) {
					System.out.println("¿Desea agregar amenidades?");
					System.out.println(" Escriba s o n");
					amenidades = Ame.nextLine();
				}
				// amenidades como tál
				if ("s".equals(amenidades)) {
					System.out.println("                Seleccion de Amenidades");
					System.out.println("           Tipos de Amenidades");
					System.out.println("1.- Tipo de transmision");
					System.out.println("2.- Color de pintura exterios");
					System.out.println("3.- Color de Tapicería");
					System.out.println("4.- Aros");
					System.out.println("5.- Accesorios exterior");
					System.out.println("6.- Accesorios interno");
					System.out.println("7.- Accesorios electronicos");
					System.out.println("8.- Regresar a seleccion de gama de vehículos");
					System.out.println("Ingrese el tipo de amenidad: ");
                                        Scanner tipa = new Scanner (System.in);
                                        tipam = tipa.nextInt();
					
					// seleccion de gama de vehículo desde las amenidades
				}
				if (g==1) {
					g = 18940;
				}
				if (g==2) {
					g = 23570;
				}
				if (g==3) {
					g = 24100;
				}
				if (g==4) {
					g = 25100;
				}
				if (g==5) {
					g = 19350;
				}
				if (g==6) {
					g = 24100;
				}
				if (g==7) {
					g = 16190;
				}
				if (g==8) {
					g = 20150;
				}
				if (g==9) {
					g = 34700;
				}
				// acá estan las amenidades 
				if (tipam==1) {
					System.out.println("     tipos de transmision");
					System.out.println("01.- Manual                                   US 0.00");
					System.out.println("02.- CVT                                      US 800");
					System.out.println("03.- Manual con Turbo                         US 0.00");
					System.out.println("04.- CVT con Tubo                             US 800");
					System.out.println("05.- Regresar a la seccion de amenidades");
					System.out.println("Ingrese el tipo de transmision");
                                        Scanner trans = new Scanner (System.in);
					transmision = trans.nextInt();
					if (transmision==1) {
						preciotransmision = 0;
						tipotransmision = "Manual";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println(""+tipotransmision+"                      US "+preciotransmision);
					}
					if (transmision==2) {
						preciotransmision = 800;
						tipotransmision = "CVT";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println(""+tipotransmision+"                      US "+preciotransmision);
					}
					if (transmision==3) {
						preciotransmision = 0;
						tipotransmision = "Manual con Turbo";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println(""+tipotransmision+"                      US "+preciotransmision);
					}
					if (transmision==4) {
						preciotransmision = 800;
						tipotransmision = "CVT con Turbo";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println(""+tipotransmision+"                      US "+preciotransmision);
					}
					System.out.println("Desea agregar otra amenida?");
					ingresar = 2;
				}
				if (tipam==2) {
					System.out.println("     Colores de Pintura exterior");
					System.out.println("01.- Cosmic Blue");
					System.out.println("02.- Burgundy Night");
					System.out.println("03.- Rallye Red");
					System.out.println("04.- Crystal Black");
					System.out.println("05.- Modern Steel");
					System.out.println("06.- Taffeta Ehite");
					System.out.println("07.- Energy Green");
					System.out.println("08.- Kona Coffee");
					System.out.println("09.- Orange Fury");
					System.out.println("10.- Helios Yellow");
					System.out.println("11.- Sonic Gray");
					System.out.println("12.- Polished Metal");
					System.out.println("13.- Regresar a la seccion de amenidades");
					System.out.println("Ingrese el color de pintura exterior");
                                        Scanner colore = new Scanner (System.in); 
					colorexterno =colore.nextInt();
					if (colorexterno==1) {
						preciocolorexterno = 0;
						tipocolorexterno = "Cosmic Blue";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("color"+tipocolorexterno+"                      US "+preciocolorexterno);
					}
					if (colorexterno==2) {
						preciocolorexterno = 0;
						tipocolorexterno = "Burgundy Night ";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("color"+tipocolorexterno+"                      US "+preciocolorexterno);
					}
					if (colorexterno==3) {
						preciocolorexterno = 0;
						tipocolorexterno = "Rallye Red ";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("color"+tipocolorexterno+"                      US "+preciocolorexterno);
					}
					if (colorexterno==4) {
						preciocolorexterno = 0;
						tipocolorexterno = "Crystal Black";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("color"+tipocolorexterno+"                      US "+preciocolorexterno);
					}
					if (colorexterno==5) {
						preciocolorexterno = 0;
						tipocolorexterno = "Modern Steel";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("color"+tipocolorexterno+"                      US "+preciocolorexterno);
					}
					if (colorexterno==6) {
						preciocolorexterno = 0;
						tipocolorexterno = "Taffeta White ";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("color"+tipocolorexterno+"                      US "+preciocolorexterno);
					}
					if (colorexterno==7) {
						preciocolorexterno = 0;
						tipocolorexterno = "Energy Green";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("color"+tipocolorexterno+"                      US "+preciocolorexterno);
					}
					if (colorexterno==8) {
						preciocolorexterno = 0;
						tipocolorexterno = "Kona Coffee";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("color"+tipocolorexterno+"                      US "+preciocolorexterno);
					}
					if (colorexterno==9) {
						preciocolorexterno = 0;
						tipocolorexterno = "Orange Fury";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("color"+tipocolorexterno+"                      US "+preciocolorexterno);
					}
					if (colorexterno==10) {
						preciocolorexterno = 0;
						tipocolorexterno = "Helios Yellow";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("color"+tipocolorexterno+"                      US "+preciocolorexterno);
					}
					if (colorexterno==11) {
						preciocolorexterno = 0;
						tipocolorexterno = "Sonic Gray";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("color"+tipocolorexterno+"                      US "+preciocolorexterno);
					}
					if (colorexterno==12) {
						preciocolorexterno = 0;
						tipocolorexterno = "Polished Metal ";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("color: "+tipocolorexterno+"                      US "+preciocolorexterno);
					}
					System.out.println("Desea agregar otra amenida?");
					ingresar = 2;
				}
				if (tipam==3) {
					System.out.println("     Color de tapicería");
					System.out.println("1.- Gray Cloth ");
					System.out.println("2.- Black Cloth ");
					System.out.println("3.- Black/Gray Cloth");
					System.out.println("4.- Red/Black Suede Effect-Fabric");
					System.out.println("5.- Regresar a la seccion de amenidades");
					System.out.println("Ingrese el aro");
                                        Scanner colorta = new Scanner (System.in);
					colortapiceria = colorta.nextInt();
					if (colortapiceria==1) {
                                            int preciotapiceria = 0;
                                            String tipotapiceria = "Gray Cloth";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades");
						System.out.println("");
						System.out.println("Tipo de Aros: "+tipotapiceria+"                       US "+preciotapiceria);
					}
					if (colortapiceria==2) {
                                            int preciotapiceria = 0;
                                            String tipotapiceria = "Black Cloth";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades");
						System.out.println("");
						System.out.println("Tipo de Aros: "+tipotapiceria+"                       US "+preciotapiceria);
					}
					if (colortapiceria==3) {
						int preciotapiceria = 0;
						String tipotapiceria = "Black/Gray Cloth";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades");
						System.out.println("");
						System.out.println("Tipo de Aros: "+tipotapiceria+"                       US "+preciotapiceria);
					}
					if (colortapiceria==4) {
						int preciotapiceria = 0;
						String tipotapiceria = "Red/Black Suede Effect-Fabric";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades");
						System.out.println("");
						System.out.println("Tipo de Aros: "+tipotapiceria+"                       US "+preciotapiceria);
					}
					if (colortapiceria==5) {
                                            int preciotapiceria = 0;
                                            String tipotapiceria = "15";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades");
						System.out.println("");
						System.out.println("Tipo de Aros: "+tipotapiceria+"                       US "+preciotapiceria);
					}
					System.out.println("Desea agregar otra amenida?");
					ingresar = 2;
				}
				if (tipam==4) {
					System.out.println("     Aros");
					System.out.println("1.- 15");
					System.out.println("2.- 16");
					System.out.println("3.- 17");
					System.out.println("4.- 18");
					System.out.println("5.- 19");
					System.out.println("6.- Regresar a la seccion de amenidades");
					System.out.println("Ingrese el aro");
                                        Scanner ar = new Scanner (System.in); 
                                      
					aro = ar.nextInt();
					if (aro==1) {
						precioaro = 0;
						tipoaro = "15";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades");
						System.out.println("");
						System.out.println("Tipo de Aros: "+tipoaro+"                       US "+precioaro);
					}
					if (aro==2) {
						precioaro = 0;
						tipoaro = "16";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades");
						System.out.println("");
						System.out.println("Tipo de Aros: "+tipoaro+"                       US "+precioaro);
					}
					if (aro==3) {
						precioaro = 1688;
						tipoaro = "17";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades");
						System.out.println("");
						System.out.println("Tipo de Aros: "+tipoaro+"                       US "+precioaro);
					}
					if (aro==4) {
						precioaro = 1700;
						tipoaro = "18";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades");
						System.out.println("");
						System.out.println("Tipo de Aros: "+tipoaro+"                       US "+precioaro);
					}
					if (aro==5) {
						precioaro = 3011;
						tipoaro = "19";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades");
						System.out.println("");
						System.out.println("Tipo de Aros: "+tipoaro+"                       US "+precioaro);
					}
					ingresar = 2;
				}
				if (tipam==5) {
					System.out.println("     Accesorios Exteriores");
					System.out.println("1.- Body Side Molding ");
					System.out.println("2.- Car Cover");
					System.out.println("3.- Decklid Spoiler");
					System.out.println("4.- Door Edge Film ");
					System.out.println("5.- Door Edge Guards");
					System.out.println("6.- Door Trim Chrome ");
					System.out.println("7.- Door Visor");
					System.out.println("8.- Front Fender Emblems");
					System.out.println("9.- Rear Bumper Applique");
					System.out.println("10.- Fog Lights ");
					System.out.println("11.- Nose Mascs");
					System.out.println("12.- Moonrof Visor");
					System.out.println("13.- Splash Guard Set");
					System.out.println("14.- Dust Cover");
					System.out.println("15.- Door Mirror Cover - Carbon Fiber");
					System.out.println("16.- Regresar a la seccion de amenidades");
					System.out.println("Ingrese el tipo de accesorios externos");
					accesorioexterno = Integer.parseInt(bufEntrada.readLine());
					if (accesorioexterno==1) {
						preciodeaccesoriosexternos = 217;
						tipoaccesoriosexternos = "Body Side Molding ";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosexternos+"                      US "+preciodeaccesoriosexternos);
					}
					if (accesorioexterno==2) {
						preciodeaccesoriosexternos = 230;
						tipocolorexterno = "Car Cover ";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosexternos+"                      US "+preciodeaccesoriosexternos);
					}
					if (accesorioexterno==3) {
						preciodeaccesoriosexternos = (int) 299.99;
						tipocolorexterno = "Decklid Spoiler ";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosexternos+"                      US "+preciodeaccesoriosexternos);
					}
					if (accesorioexterno==4) {
						preciodeaccesoriosexternos = 42;
						tipocolorexterno = "Door Edge Film ";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosexternos+"                      US "+preciodeaccesoriosexternos);
					}
					if (accesorioexterno==5) {
						preciodeaccesoriosexternos = 84;
						tipocolorexterno = "Door Edge Guards";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosexternos+"                      US "+preciodeaccesoriosexternos);
					}
					if (accesorioexterno==6) {
						preciodeaccesoriosexternos = 285;
						tipocolorexterno = "Door Trim Chrome";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosexternos+"                      US "+preciodeaccesoriosexternos);
					}
					if (accesorioexterno==7) {
						preciodeaccesoriosexternos = 185;
						tipocolorexterno = "Door Visor";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosexternos+"                      US "+preciodeaccesoriosexternos);
					}
					if (accesorioexterno==8) {
						preciodeaccesoriosexternos = 50;
						tipocolorexterno = "Front Fender Emblems ";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosexternos+"                      US "+preciodeaccesoriosexternos);
					}
					if (accesorioexterno==9) {
						preciodeaccesoriosexternos = 70;
						tipocolorexterno = "Rear Bumper Applique";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosexternos+"                      US "+preciodeaccesoriosexternos);
					}
					if (accesorioexterno==10) {
						preciodeaccesoriosexternos = 325;
						tipocolorexterno = "Fog Lights";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosexternos+"                      US "+preciodeaccesoriosexternos);
					}
					if (accesorioexterno==11) {
						preciodeaccesoriosexternos = 150;
						tipocolorexterno = "Nose Mascs";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosexternos+"                      US "+preciodeaccesoriosexternos);
					}
					if (accesorioexterno==12) {
						preciodeaccesoriosexternos = 138;
						tipocolorexterno = "Moonrof Visor ";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosexternos+"                      US "+preciodeaccesoriosexternos);
					}
					if (accesorioexterno==13) {
						preciodeaccesoriosexternos = 104;
						tipocolorexterno = "Splash Guard Set ";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosexternos+"                      US "+preciodeaccesoriosexternos);
					}
					if (accesorioexterno==14) {
						preciodeaccesoriosexternos = 350;
						tipocolorexterno = "Dust Cove";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosexternos+"                      US "+preciodeaccesoriosexternos);
					}
					if (accesorioexterno==15) {
						preciodeaccesoriosexternos = 520;
						tipocolorexterno = "Door Mirror Cover - Carbon Fiber";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosexternos+"                      US "+preciodeaccesoriosexternos);
					}
					System.out.println("Desea agregar otra amenida?");
					ingresar = 2;
				}
				if (tipam==6) {
					System.out.println("     Accesorios Internos ");
					System.out.println("1.- All-Seasons Floor Mats ");
					System.out.println("2.- Automatic-Dimming Mirror");
					System.out.println("3.- Cargo Hook ");
					System.out.println("4.- Cargo Net ");
					System.out.println("5.- Console Illumination");
					System.out.println("6.- Cargo Organizer");
					System.out.println("7.- Door Panel Protector");
					System.out.println("8.- Armrest Compartiment");
					System.out.println("9.- Door Sill Trim-Illuminated");
					System.out.println("10.- Cargo Cover");
					System.out.println("11.- Cargo Liner");
					System.out.println("12.- Regresar a la seccion de amenidades");
					System.out.println("Ingrese el tipo de accesorio interno");
					accesoriointerno = Integer.parseInt(bufEntrada.readLine());
					if (accesoriointerno==1) {
						preciodeaccesoriosinterno = 142;
						tipoaccesoriosinterno = "All-Seasons Floor Mats";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosinterno+"                      US "+preciodeaccesoriosinterno);
					}
					if (accesorioexterno==2) {
						preciodeaccesoriosinterno = 219;
						tipoaccesoriosinterno = "Automatic-Dimming Mirror";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosinterno+"                      US "+preciodeaccesoriosinterno);
					}
					if (accesorioexterno==3) {
						preciodeaccesoriosinterno = 12;
						tipoaccesoriosinterno = "Cargo Hook";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosinterno+"                      US "+preciodeaccesoriosinterno);
					}
					if (accesorioexterno==4) {
						preciodeaccesoriosinterno = 49;
						tipoaccesoriosinterno = "Cargo Net";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosinterno+"                      US "+preciodeaccesoriosinterno);
					}
					if (accesorioexterno==5) {
						preciodeaccesoriosinterno = 250;
						tipoaccesoriosinterno = "Console Illumination";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosinterno+"                      US "+preciodeaccesoriosinterno);
					}
					if (accesorioexterno==6) {
						preciodeaccesoriosinterno = 87;
						tipoaccesoriosinterno = "Cargo Organizer";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosinterno+"                      US "+preciodeaccesoriosinterno);
					}
					if (accesorioexterno==7) {
						preciodeaccesoriosinterno = 149;
						tipoaccesoriosinterno = "Door Panel Protector";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosinterno+"                      US "+preciodeaccesoriosinterno);
					}
					if (accesorioexterno==8) {
						preciodeaccesoriosinterno = 337;
						tipoaccesoriosinterno = "Armrest Compartiment";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosinterno+"                      US "+preciodeaccesoriosinterno);
					}
					if (accesorioexterno==9) {
						preciodeaccesoriosinterno = 290;
						tipoaccesoriosinterno = "Door Sill Trim-Illuminated";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosinterno+"                      US "+preciodeaccesoriosinterno);
					}
					if (accesorioexterno==10) {
						preciodeaccesoriosinterno = 290;
						tipoaccesoriosinterno = "Cargo Cover ";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosinterno+"                      US "+preciodeaccesoriosinterno);
					}
					if (accesorioexterno==11) {
						preciodeaccesoriosinterno = 187;
						tipoaccesoriosinterno = "Cargo Liner";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesoriosinterno+"                      US "+preciodeaccesoriosinterno);
					}
					System.out.println("Desea agregar otra amenida?");
					ingresar = 2;
				}
				if (tipam==7) {
					System.out.println("     Accesorios Electrónicos");
					System.out.println("1.- Wireless Phone Charger");
					System.out.println("2.- USB Charger - 2.1 Amp.");
					System.out.println("3.- Puddle Light");
					System.out.println("4.- Parking Sensors ");
					System.out.println("5.- Regresar a la seccion de amenidades");
					System.out.println("Ingrese el tipo de accesorio electrónico");
					accesorioelectronico = Integer.parseInt(bufEntrada.readLine());
					if (accesorioelectronico==1) {
						preciodeaccesorioselectronico = 305;
                                            String tipoaccesorioselectronico = "Wireless Phone Charger";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesorioselectronico+"                      US "+preciodeaccesorioselectronico);
					}
					if (accesorioexterno==2) {
						preciodeaccesorioselectronico = 120;
                                            String tipoaccesorioselectronico = "USB Charger - 2.1 Amp.";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesorioselectronico+"                      US "+preciodeaccesorioselectronico);
					}
					if (accesorioexterno==3) {
						preciodeaccesorioselectronico = 185;
                                            String tipoaccesorioselectronico = "Puddle Light";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesorioselectronico+"                      US "+preciodeaccesorioselectronico);
					}
					if (accesorioexterno==4) {
						preciodeaccesorioselectronico = 514;
                                            String tipoaccesorioselectronico = "Parking Sensors";
						System.out.println("Ha seleccionado la Gama: "+gam+" de "+g+" dólares");
						System.out.println("Amenidades:");
						System.out.println("");
						System.out.println("Accesorio Externo: "+tipoaccesorioselectronico+"                      US "+preciodeaccesorioselectronico);
					}
					System.out.println("Desea agregar otra amenida?");
					ingresar = 2;
				}
				// aca no se escogio ninguna amenidad
				if ("n".equals(amenidades)) {
					System.out.println("Gama seleccionada:"+gam+"US$ "+g);
					System.out.println("Amenidades: Ninguna");
					System.out.println("Total:         US$ "+g);
					ingresar = 2;
				}
			}
                        
                   //marca el final del mientras(while)
                        
                        if (ingresar == 2){
               
               tipam = 0;
               
               } else{
               
               tipam = 7;
               
               }             
                        
                        
                    
                        
		}
        
        
    }
    
}
