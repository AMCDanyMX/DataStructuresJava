package pruebas;

import entradasalida.SalidaTerminal;
import estructuraslineales.ArregloDatos;
import registros.campesinos.Campesino;
import registros.campesinos.Ejido;

public class PruebaCampesinosPrac3 {
    public static void main(String[] args) {

        //Produce el ejido : frijol, maíz, chile, zanahoria, ajo y cebolla

        Ejido ejido1 = new Ejido("Ejido Pancho Villa y Emiliano Zapata seccion frijol",7);

        //CampesinoJuan
        ArregloDatos toneladasjuanfrijol = new ArregloDatos(3);
        toneladasjuanfrijol.agregar(2.0);
        toneladasjuanfrijol.agregar(1.0);
        toneladasjuanfrijol.agregar(5.0);
        Campesino campesinojuan1 = new Campesino("120","Juan","Frijol","2019",toneladasjuanfrijol);

        ejido1.agregarCampesino(campesinojuan1);

        //Campesino Pedro
        ArregloDatos toneladaspedrofrijol = new ArregloDatos(3);
        toneladaspedrofrijol.agregar(30.0);
        toneladaspedrofrijol.agregar(50.0);
        toneladaspedrofrijol.agregar(5.0);
        Campesino campesinopedro1 = new Campesino("121","Pedro","Frijol","2019",toneladaspedrofrijol);

        ejido1.agregarCampesino(campesinopedro1);

        //Campesino Miguel
        ArregloDatos toneladasmiguelfrijol = new ArregloDatos(3);
        toneladasmiguelfrijol.agregar(30.0);
        toneladasmiguelfrijol.agregar(40.0);
        toneladasmiguelfrijol.agregar(5.0);
        Campesino campesinomiguel1  = new Campesino("122","Miguel","Frijol","2019",toneladasmiguelfrijol);

        ejido1.agregarCampesino(campesinomiguel1);

        //Campesino Daniel
        ArregloDatos toneladasdanielfrijol = new ArregloDatos(3);
        toneladasdanielfrijol.agregar(20.0);
        toneladasdanielfrijol.agregar(20.0);
        toneladasdanielfrijol.agregar(25.0);
        Campesino campesinodaniel1  = new Campesino("123","Daniel","Frijol","2020",toneladasdanielfrijol);

        ejido1.agregarCampesino(campesinodaniel1);

        //Campesino Ricardo
        ArregloDatos toneladasricardofrijol = new ArregloDatos(3);
        toneladasricardofrijol.agregar(3.0);
        toneladasricardofrijol.agregar(5.0);
        toneladasricardofrijol.agregar(15.0);
        Campesino campesinoricardo1  = new Campesino("124","Ricardo","Frijol","2020",toneladasricardofrijol);

        ejido1.agregarCampesino(campesinoricardo1);

        //Campesino Luis
        ArregloDatos toneladasluisfrijol = new ArregloDatos(3);
        toneladasluisfrijol.agregar(30.0);
        toneladasluisfrijol.agregar(70.0);
        toneladasluisfrijol.agregar(55.0);
        Campesino campesinoluis1  = new Campesino("125","Luis","Frijol","2020",toneladasluisfrijol);

        ejido1.agregarCampesino(campesinoluis1);

        //Campesino Aldo
        ArregloDatos toneladasaldofrijol = new ArregloDatos(3);
        toneladasaldofrijol.agregar(5.0);
        toneladasaldofrijol.agregar(40.0);
        toneladasaldofrijol.agregar(6.0);
        Campesino campesinoaldo1  = new Campesino("126","Aldo","Frijol","2021",toneladasaldofrijol);
        ejido1.agregarCampesino(campesinoaldo1);


        //----------------------------------------------------------------------------------------------------------------------------------//


        Ejido ejido2 = new Ejido("Ejido Pancho Villa y Emiliano Zapata seccion maiz",7);

        //CampesinoJuan
        ArregloDatos toneladasjuanmaiz = new ArregloDatos(3);
        toneladasjuanmaiz.agregar(20.0);
        toneladasjuanmaiz.agregar(20.0);
        toneladasjuanmaiz.agregar(20.0);
        Campesino campesinojuan2 = new Campesino("220","Juan","Maiz","2020",toneladasjuanmaiz);

        ejido2.agregarCampesino(campesinojuan2);

        //Campesino Pedro
        ArregloDatos toneladaspedromaiz = new ArregloDatos(3);
        toneladaspedromaiz.agregar(40.0);
        toneladaspedromaiz.agregar(30.0);
        toneladaspedromaiz.agregar(55.0);
        Campesino campesinopedro2 = new Campesino("221","Pedro","Maiz","2021",toneladaspedromaiz);

        ejido2.agregarCampesino(campesinopedro2);

        //Campesino Miguel
        ArregloDatos toneladasmiguelmaiz = new ArregloDatos(3);
        toneladasmiguelmaiz.agregar(10.0);
        toneladasmiguelmaiz.agregar(10.0);
        toneladasmiguelmaiz.agregar(15.0);
        Campesino campesinomiguel2  = new Campesino("222","Miguel","Maiz","2021",toneladasmiguelmaiz);

        ejido2.agregarCampesino(campesinomiguel2);

        //Campesino Daniel
        ArregloDatos toneladasdanielmaiz = new ArregloDatos(3);
        toneladasdanielmaiz.agregar(20.0);
        toneladasdanielmaiz.agregar(20.0);
        toneladasdanielmaiz.agregar(12.0);
        Campesino campesinodaniel2  = new Campesino("223","Daniel","Maiz","2020",toneladasdanielmaiz);

        ejido2.agregarCampesino(campesinodaniel2);

        //Campesino Ricardo
        ArregloDatos toneladasricardomaiz = new ArregloDatos(3);
        toneladasricardomaiz.agregar(4.0);
        toneladasricardomaiz.agregar(7.0);
        toneladasricardofrijol.agregar(9.0);
        Campesino campesinoricardo2  = new Campesino("224","Ricardo","Maiz","2020",toneladasricardomaiz);

        ejido2.agregarCampesino(campesinoricardo2);

        //Campesino Luis
        ArregloDatos toneladasluismaiz = new ArregloDatos(3);
        toneladasluismaiz.agregar(50.0);
        toneladasluismaiz.agregar(50.0);
        toneladasluismaiz.agregar(50.0);
        Campesino campesinoluis2  = new Campesino("225","Ricardo","Maiz","2021",toneladasluismaiz);

        ejido2.agregarCampesino(campesinoluis2);

        //Campesino Aldo
        ArregloDatos toneladasaldomaiz = new ArregloDatos(3);
        toneladasaldomaiz.agregar(30.0);
        toneladasaldomaiz.agregar(20.0);
        toneladasaldomaiz.agregar(20.0);
        Campesino campesinoaldo2  = new Campesino("226","Aldo","Maiz","2019",toneladasaldomaiz);

        ejido2.agregarCampesino(campesinoaldo2);


        //----------------------------------------------------------------------------------------------------------------------------------//

        Ejido ejido3 = new Ejido("Ejido Pancho Villa y Emiliano Zapata seccion chile",7);

        //CampesinoJuan
        ArregloDatos toneladasjuanchile = new ArregloDatos(3);
        toneladasjuanchile.agregar(5.0);
        toneladasjuanchile.agregar(10.0);
        toneladasjuanchile.agregar(5.0);
        Campesino campesinojuan3 = new Campesino("330","Juan","Chile","2019",toneladasjuanchile);

        ejido3.agregarCampesino(campesinojuan3);

        //Campesino Pedro
        ArregloDatos toneladaspedrochile = new ArregloDatos(3);
        toneladaspedrochile.agregar(10.0);
        toneladaspedrochile.agregar(7.0);
        toneladaspedrochile.agregar(8.0);
        Campesino campesinopedro3 = new Campesino("331","Pedro","Chile","2019",toneladaspedrochile);

        ejido3.agregarCampesino(campesinopedro3);

        //Campesino Miguel
        ArregloDatos toneladasmiguelchile = new ArregloDatos(3);
        toneladasmiguelchile.agregar(9.0);
        toneladasmiguelchile.agregar(10.0);
        toneladasmiguelchile.agregar(35.0);
        Campesino campesinomiguel3  = new Campesino("332","Miguel","Chile","2019",toneladasmiguelchile);

        ejido3.agregarCampesino(campesinomiguel3);

        //Campesino Daniel
        ArregloDatos toneladasdanielchile = new ArregloDatos(3);
        toneladasdanielchile.agregar(60.0);
        toneladasdanielchile.agregar(50.0);
        toneladasdanielchile.agregar(52.0);
        Campesino campesinodaniel3  = new Campesino("333","Daniel","Chile","2019",toneladasdanielchile);

        ejido3.agregarCampesino(campesinodaniel3);

        //Campesino Ricardo
        ArregloDatos toneladasricardochile = new ArregloDatos(3);
        toneladasricardochile.agregar(20.0);
        toneladasricardochile.agregar(20.0);
        toneladasricardochile.agregar(25.0);
        Campesino campesinoricardo3  = new Campesino("334","Ricardo","Chile","2019",toneladasricardochile);

        ejido3.agregarCampesino(campesinoricardo3);


        //Campesino Luis
        ArregloDatos toneladasluischile= new ArregloDatos(3);
        toneladasluischile.agregar(30.0);
        toneladasluischile.agregar(30.0);
        toneladasluischile.agregar(25.0);
        Campesino campesinoluis3  = new Campesino("335","Luis","Chile","2019",toneladasluischile);

        ejido3.agregarCampesino(campesinoluis3);

        //Campesino Aldo
        ArregloDatos toneladasaldochile = new ArregloDatos(3);
        toneladasaldochile.agregar(30.0);
        toneladasaldochile.agregar(30.0);
        toneladasaldochile.agregar(15.0);
        Campesino campesinoaldo3  = new Campesino("336","Aldo","Maiz","2019",toneladasaldochile);

        ejido3.agregarCampesino(campesinoaldo3);


        //----------------------------------------------------------------------------------------------------------------------------------//
        //Ejido 4
        Ejido ejido4 = new Ejido("Ejido Pancho Villa y Emiliano Zapata seccion zanahoria",7);

        //CampesinoJuan
        ArregloDatos toneladasjuanzanahoria = new ArregloDatos(3);
        toneladasjuanzanahoria.agregar(20.0);
        toneladasjuanzanahoria.agregar(10.0);
        toneladasjuanzanahoria.agregar(5.0);
        Campesino campesinojuan4 = new Campesino("440","Juan","Zanahoria","2020",toneladasjuanzanahoria);

        ejido4.agregarCampesino(campesinojuan4);

        //Campesino Pedro
        ArregloDatos toneladaspedrozanahoria = new ArregloDatos(3);
        toneladaspedrozanahoria.agregar(20.0);
        toneladaspedrozanahoria.agregar(20.0);
        toneladaspedrozanahoria.agregar(55.0);
        Campesino campesinopedro4 = new Campesino("441","Pedro","Zanahoria","2020",toneladaspedrozanahoria);

        ejido4.agregarCampesino(campesinopedro4);

        //Campesino Miguel
        ArregloDatos toneladasmiguelzanahoria = new ArregloDatos(3);
        toneladasmiguelzanahoria.agregar(50.0);
        toneladasmiguelzanahoria.agregar(60.0);
        toneladasmiguelzanahoria.agregar(15.0);
        Campesino campesinomiguel4  = new Campesino("442","Miguel","Zanahoria","2020",toneladasmiguelzanahoria);

        ejido4.agregarCampesino(campesinomiguel4);
        //Campesino Daniel
        ArregloDatos toneladasdanielzanahoria = new ArregloDatos(3);
        toneladasdanielzanahoria.agregar(10.0);
        toneladasdanielzanahoria.agregar(20.0);
        toneladasdanielzanahoria.agregar(30.0);
        Campesino campesinodaniel4  = new Campesino("443","Daniel","Zanahoria","2020",toneladasdanielzanahoria);

        ejido4.agregarCampesino(campesinodaniel4);

        //Campesino Ricardo
        ArregloDatos toneladasricardozanahoria = new ArregloDatos(3);
        toneladasricardozanahoria.agregar(10.0);
        toneladasricardozanahoria.agregar(60.0);
        toneladasricardozanahoria.agregar(27.0);
        Campesino campesinoricardo4 = new Campesino("444","Ricardo","Zanahoria","2020",toneladasricardozanahoria);

        ejido4.agregarCampesino(campesinoricardo4);

        //Campesino Luis
        ArregloDatos toneladasluiszanahoria= new ArregloDatos(3);
        toneladasluiszanahoria.agregar(250.0);
        toneladasluiszanahoria.agregar(24.0);
        toneladasluiszanahoria.agregar(25.0);
        Campesino campesinoluis4  = new Campesino("445","Luis","Zanahoria","2020",toneladasluiszanahoria);

        ejido4.agregarCampesino(campesinoluis4);

        //Campesino Aldo
        ArregloDatos toneladasaldozanahoria = new ArregloDatos(3);
        toneladasaldozanahoria.agregar(10.0);
        toneladasaldozanahoria.agregar(10.0);
        toneladasaldozanahoria.agregar(25.0);
        Campesino campesinoaldo4  = new Campesino("446","Aldo","Zanahoria","2021",toneladasaldozanahoria);

        ejido4.agregarCampesino(campesinoaldo4);

        //----------------------------------------------------------------------------------------------------------------------------------//
        //subseccion5 deñ ejido
        Ejido ejido5 = new Ejido("Ejido Pancho Villa y Emiliano Zapata seccion ajo",7);

        //CampesinoJuan
        ArregloDatos toneladasjuanajo = new ArregloDatos(3);
        toneladasjuanajo.agregar(20.0);
        toneladasjuanajo.agregar(30.0);
        toneladasjuanajo.agregar(55.0);
        Campesino campesinojuan5 = new Campesino("550","Juan","Ajo","2021",toneladasjuanajo);

        ejido5.agregarCampesino(campesinojuan5);

        //Campesino Pedro
        ArregloDatos toneladaspedroajo = new ArregloDatos(3);
        toneladaspedroajo.agregar(60.0);
        toneladaspedroajo.agregar(20.0);
        toneladaspedroajo.agregar(15.0);
        Campesino campesinopedro5 = new Campesino("551","Pedro","Ajo","2021",toneladaspedroajo);

        ejido5.agregarCampesino(campesinopedro5);

        //Campesino Miguel
        ArregloDatos toneladasmiguelajo = new ArregloDatos(3);
        toneladasmiguelajo.agregar(10.0);
        toneladasmiguelajo.agregar(10.0);
        toneladasmiguelajo.agregar(15.0);
        Campesino campesinomiguel5  = new Campesino("552","Miguel","Ajo","2021",toneladasmiguelajo);

        ejido5.agregarCampesino(campesinomiguel5);
        //Campesino Daniel
        ArregloDatos toneladasdanielajo = new ArregloDatos(3);
        toneladasdanielajo.agregar(10.0);
        toneladasdanielajo.agregar(90.0);
        toneladasdanielajo.agregar(70.0);
        Campesino campesinodaniel5 = new Campesino("553","Daniel","Ajo","2021",toneladasdanielajo);

        ejido5.agregarCampesino(campesinodaniel5);

        //Campesino Ricardo
        ArregloDatos toneladasricardoajo = new ArregloDatos(3);
        toneladasricardoajo.agregar(30.0);
        toneladasricardoajo.agregar(50.0);
        toneladasricardoajo.agregar(15.0);
        Campesino campesinoricardo5 = new Campesino("554","Ricardo","Ajo","2021",toneladasricardoajo);

        ejido5.agregarCampesino(campesinoricardo5);

        //Campesino Luis
        ArregloDatos toneladasluisajo= new ArregloDatos(3);
        toneladasluisajo.agregar(10.0);
        toneladasluisajo.agregar(60.0);
        toneladasluisajo.agregar(15.0);
        Campesino campesinoluis5 = new Campesino("555","Luis","Ajo","2021",toneladasluisajo);

        ejido5.agregarCampesino(campesinoluis5);


        //Campesino Aldo
        ArregloDatos toneladasaldoajo = new ArregloDatos(3);
        toneladasaldoajo.agregar(20.0);
        toneladasaldoajo.agregar(20.0);
        toneladasaldoajo.agregar(25.0);
        Campesino campesinoaldo5  = new Campesino("556","Aldo","Ajo","2021",toneladasaldoajo);

        ejido5.agregarCampesino(campesinoaldo5);

        //----------------------------------------------------------------------------------------------------------------------------------//

        //subseccion5 deñ ejido
        Ejido ejido6 = new Ejido("Ejido Pancho Villa y Emiliano Zapata seccion cebolla",7);

        //CampesinoJuan
        ArregloDatos toneladasjuancebolla = new ArregloDatos(3);
        toneladasjuancebolla.agregar(30.0);
        toneladasjuancebolla.agregar(30.0);
        toneladasjuancebolla.agregar(35.0);
        Campesino campesinojuan6 = new Campesino("660","Juan","Cebolla","2021",toneladasjuancebolla);

        ejido6.agregarCampesino(campesinojuan6);

        //Campesino Pedro
        ArregloDatos toneladaspedrocebolla = new ArregloDatos(3);
        toneladaspedrocebolla.agregar(40.0);
        toneladaspedrocebolla.agregar(45.0);
        toneladaspedrocebolla.agregar(35.0);
        Campesino campesinopedro6 = new Campesino("661","Pedro","Cebolla","2020",toneladaspedrocebolla);

        ejido6.agregarCampesino(campesinopedro6);

        //Campesino Miguel
        ArregloDatos toneladasmiguelcebolla = new ArregloDatos(3);
        toneladasmiguelcebolla.agregar(30.0);
        toneladasmiguelcebolla.agregar(50.0);
        toneladasmiguelcebolla.agregar(5.0);
        Campesino campesinomiguel6  = new Campesino("662","Miguel","Cebolla","2020",toneladasmiguelcebolla);

        ejido6.agregarCampesino(campesinomiguel6);
        //Campesino Daniel
        ArregloDatos toneladasdanielcebolla = new ArregloDatos(3);
        toneladasdanielcebolla.agregar(1.0);
        toneladasdanielcebolla.agregar(1.0);
        toneladasdanielcebolla.agregar(70.0);
        Campesino campesinodaniel6 = new Campesino("663","Daniel","Cebolla","2019",toneladasdanielcebolla);

        ejido6.agregarCampesino(campesinodaniel6);

        //Campesino Ricardo
        ArregloDatos toneladasricardocebolla = new ArregloDatos(3);
        toneladasricardocebolla.agregar(10.0);
        toneladasricardocebolla.agregar(13.0);
        toneladasricardocebolla.agregar(15.0);
        Campesino campesinoricardo6 = new Campesino("664","Ricardo","Cebolla","2019",toneladasricardocebolla);

        ejido6.agregarCampesino(campesinoricardo6);

        //Campesino Luis
        ArregloDatos toneladasluiscebolla= new ArregloDatos(3);
        toneladasluiscebolla.agregar(50.0);
        toneladasluiscebolla.agregar(60.0);
        toneladasluiscebolla.agregar(75.0);
        Campesino campesinoluis6 = new Campesino("665","Luis","Cebolla","2019",toneladasluiscebolla);

        ejido6.agregarCampesino(campesinoluis6);

        //Campesino Aldo
        ArregloDatos toneladasaldocebolla = new ArregloDatos(3);
        toneladasaldocebolla.agregar(60.0);
        toneladasaldocebolla.agregar(60.0);
        toneladasaldocebolla.agregar(65.0);
        Campesino campesinoaldo6  = new Campesino("666","Aldo","Cebolla","2019",toneladasaldocebolla);

        ejido6.agregarCampesino(campesinoaldo6);


        //----------------------------------------------------------------------------------------------------------------------------------//
        //Promedios de todos los campesinos
        //

        SalidaTerminal.consola("El Ejido Pancho Villa y Emiliano Zapata cuenta con los siguientes campesinos: ");
        SalidaTerminal.consola("\n");
        ejido1.imprimirCampesinos();
        SalidaTerminal.consola("\n");
        //A. El promedio de toneladas producidas por un campesino en particular de un
        //producto en específico.
        SalidaTerminal.consola("\n");
        SalidaTerminal.consola("El promedio de Juan es: "+ejido3.obtenerPromedio("120"));
        SalidaTerminal.consola("\n");



        //B. El campesino produjo menos toneladas de frijol en un año en particular.

        //C. Indique cuál campesino fue el más favorecido en sus siembras en un año en
        //particular


        //D. ¿Qué producto convino más en la siembra en un año en particular?


        //E. ¿Qué año produjo mejores cantidades de producto X para el campesino Y?

        //F. ¿Qué campesinos produjeron menos cantidad de frijol que el campesino Y?


        // G. ¿Qué persona es la que menos ha cosechado en este año?


        // H. ¿Cuántas toneladas producen de maíz Juan, Pedro y Miguel?


        //I. ¿Qué producto produce más de 50 toneladas en promedio por año?


        //J. ¿Qué campesino produce menos de 40 toneladas de productos por año?




        //double promediofrijolpedro = ejido1.obtenerPromedioToneladas("Pedro");
        //double promediomaizpedro = ejido2.obtenerPromedioToneladas("Pedro");

        //double sumapromedios = promediomaizpedro+promediofrijolpedro;
        //SalidaTerminal.consola("La cantidad total de las toneladas de Pedro es:" + sumapromedios);
    }


}
