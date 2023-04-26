package Tema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestareSiAfisari {
    public void adaugareDateCatalog(){
        Catalog ct = Catalog.getInstance();
        // primul curs

        Teacher t1 = (Teacher) UserFactory.getUser(UserFactory.UserType.Teacher,"Ion", "Mihalache");
        Assistant a1 = (Assistant) UserFactory.getUser(UserFactory.UserType.Assistant,"Alexandra", "Maria");
        Assistant a2 = (Assistant) UserFactory.getUser(UserFactory.UserType.Assistant,"Andrei", "Georgescu");

        Course curs1 = new PartialCourse.PartialCoursebuilder("Programare Orientata pe Obiecte")
                .prof(t1)
                .build();
        curs1.setAsistenti(a1);
        curs1.setAsistenti(a2);
        curs1.setStrategy("BestPartialScore");

        ///// prima grupa

        Group g1 = new Group("312CC", a2);

        ///// adaugam studentii

        Parent p1 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Maria", "Frone");
        Parent p2 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Daniel", "Frone");
        Student s1 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"Gigel", "Frone");
        s1.setMother(p1);
        s1.setFather(p2);
        g1.addStudent(s1);
        curs1.addGrade(new Grade(s1,"Programare Orientata pe Obiecte"));

        Parent p19 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Vasile", "Andrei");
        Student s11 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"Cosmin", "Andrei");
        s11.setFather(p19);
        g1.addStudent(s11);
        curs1.addGrade(new Grade(s11,"Paradigme de programare"));

        Parent p5 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Letitia", "Dragomir");
        Student s3 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"Ionel", "Dragomir");
        s3.setMother(p5);
        g1.addStudent(s3);
        curs1.addGrade(new Grade(s3,"Programare Orientata pe Obiecte"));

        Parent p6 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Adriana", "Florea");
        Parent p7 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Catalin", "Florea");
        Student s4 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"Florin", "Florea");
        s4.setMother(p6);
        s4.setFather(p7);
        g1.addStudent(s4);
        curs1.addGrade(new Grade(s4,"Programare Orientata pe Obiecte"));

        Parent p8 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Carmen", "Busuioc");
        Parent p9 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Nelu", "Busuioc");
        Student s5 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"Costel", "Busuioc");
        s5.setMother(p8);
        s5.setFather(p9);
        g1.addStudent(s5);
        curs1.addGrade(new Grade(s5,"Programare Orientata pe Obiecte"));

        curs1.setGrupe(g1);


        ///// a doua grupa

        Group g2 = new Group("314CC", a1);

        ///// adaugam studentii

        Parent p10 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Viorela", "Moisescu");
        Parent p11 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Ionut", "Moisescu");
        Student s6 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"Sebastian", "Moisescu");
        s6.setMother(p10);
        s6.setFather(p11);
        g2.addStudent(s6);
        curs1.addGrade(new Grade(s6,"Programare Orientata pe Obiecte"));

        Parent p13 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Alecu", "Oana");
        Student s7 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"Larisa", "Oana");
        s7.setFather(p13);
        g2.addStudent(s7);
        curs1.addGrade(new Grade(s7,"Programare Orientata pe Obiecte"));

        Parent p14 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Lidia", "Calin");
        Student s8 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"Georgiana", "Calin");
        s8.setMother(p14);
        g2.addStudent(s8);
        curs1.addGrade(new Grade(s8,"Programare Orientata pe Obiecte"));

        Parent p15 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Anastasia", "Barbu");
        Parent p16 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Lucian", "Barbu");
        Student s9 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"Dragos", "Barbu");
        s9.setMother(p15);
        s9.setFather(p16);
        g2.addStudent(s9);
        curs1.addGrade(new Grade(s9,"Programare Orientata pe Obiecte"));

        Parent p17 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Mihaela", "Ciobanu");
        Parent p18 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Emil", "Ciobanu");
        Student s10 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"Alberto", "Ciobanu");
        s10.setMother(p17);
        s10.setFather(p18);
        g2.addStudent(s10);
        curs1.addGrade(new Grade(s10,"Programare Orientata pe Obiecte"));

        curs1.setGrupe(g2);

        curs1.setDexGrupe(g1);
        curs1.setDexGrupe(g2);


        // al doilea curs

        Teacher t2 = (Teacher) UserFactory.getUser(UserFactory.UserType.Teacher,"Sonia", "Lupu");
        Assistant a3 = (Assistant) UserFactory.getUser(UserFactory.UserType.Assistant,"Florentina", "Bratonis");
        Assistant a4 = (Assistant) UserFactory.getUser(UserFactory.UserType.Assistant,"Horia", "Ghita");

        Course curs2 = new FullCourse.FullCoursebuilder("Paradigme de programare")
                .prof(t2)
                .build();
        curs2.setAsistenti(a3);
        curs2.setAsistenti(a4);
        curs2.setStrategy("BestExamScore");

        ///// prima grupa de la al doilea curs

        Group g3 = new Group("312CC", a3);

        ///// adaugam studentii
        g3.addStudent(s1);
        curs2.addGrade(new Grade(s1,"Paradigme de programare"));

        g3.addStudent(s11);
        curs2.addGrade(new Grade(s11,"Paradigme de programare"));

        g3.addStudent(s3);
        curs2.addGrade(new Grade(s3,"Paradigme de programare"));
        g3.addStudent(s4);
        curs2.addGrade(new Grade(s4,"Paradigme de programare"));
        g3.addStudent(s5);
        curs2.addGrade(new Grade(s5,"Paradigme de programare"));

        curs2.setGrupe(g3);

        ///// a doua grupa la al doilea curs

        Group g4 = new Group("314CC", a4);

        ///// adaugam studentii
        g4.addStudent(s6);
        curs2.addGrade(new Grade(s6,"Paradigme de programare"));
        g4.addStudent(s7);
        curs2.addGrade(new Grade(s7,"Paradigme de programare"));
        g4.addStudent(s8);
        curs2.addGrade(new Grade(s8,"Paradigme de programare"));
        g4.addStudent(s9);
        curs2.addGrade(new Grade(s9,"Paradigme de programare"));
        g4.addStudent(s10);
        curs2.addGrade(new Grade(s10,"Paradigme de programare"));

        curs2.setGrupe(g4);

        curs2.setDexGrupe(g3);
        curs2.setDexGrupe(g4);


        // creere al treilea curs

        Teacher t3 = (Teacher) UserFactory.getUser(UserFactory.UserType.Teacher,"George", "Dinu");
        Assistant a5 = (Assistant) UserFactory.getUser(UserFactory.UserType.Assistant,"Emilian", "Voinea");
        Assistant a6 = (Assistant) UserFactory.getUser(UserFactory.UserType.Assistant,"Adrian", "Sava");

        Course curs3 = new PartialCourse.PartialCoursebuilder("Electronica digitala")
                .prof(t3)
                .build();
        curs3.setAsistenti(a5);
        curs3.setAsistenti(a6);
        curs3.setStrategy("BestTotalScore");

        ///// prima grupa de la al treilea curs

        Group g5 = new Group("311CC", a6);

        ///// adaugam studentii

        Student s12 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"Livia", "Ursu");
        g5.addStudent(s12);
        curs3.addGrade(new Grade(s12,"Electronica digitala"));

        Parent p20 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Albert", "Pop");
        Student s13 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"Alfred", "Pop");
        s13.setFather(p20);
        g5.addStudent(s13);
        curs3.addGrade(new Grade(s13,"Electronica digitala"));


        Parent p21 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Elena", "Iancu");
        Student s14 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"iulian", "Iancu");
        s14.setMother(p21);
        g5.addStudent(s14);
        curs3.addGrade(new Grade(s14,"Electronica digitala"));


        Parent p22 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Ana", "Negoita");
        Parent p23 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Marius", "Negoita");
        Student s15 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"Sofia", "Negoita");
        s15.setMother(p22);
        s15.setFather(p23);
        g5.addStudent(s15);
        curs3.addGrade(new Grade(s15,"Electronica digitala"));


        Parent p24 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Corina", "Dobrica");
        Parent p25 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Cristi", "Dobrica");
        Student s16 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"Alma", "Dobrica");
        s16.setMother(p24);
        s16.setFather(p25);
        g5.addStudent(s16);
        curs3.addGrade(new Grade(s16,"Electronica digitala"));


        curs3.setGrupe(g5);

        ///// a doua grupa de la al treilea curs

        Group g6 = new Group("313CC", a5);

        ///// adaugam studentii

        Parent p26 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Victoria", "Manole");
        Parent p27 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Andrei", "Manole");
        Student s17 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"Cristian", "Manole");
        s17.setMother(p26);
        s17.setFather(p27);
        g6.addStudent(s17);
        curs3.addGrade(new Grade(s17,"Electronica digitala"));


        Parent p28 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Bogdan", "Pavel");
        Student s18 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"Denisa", "Pavel");
        s18.setFather(p28);
        g6.addStudent(s18);
        curs3.addGrade(new Grade(s18,"Electronica digitala"));


        Parent p29 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Monica", "Petrescu");
        Student s19 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"Alex", "Petrescu");
        s19.setMother(p29);
        g6.addStudent(s19);
        curs3.addGrade(new Grade(s19,"Electronica digitala"));


        Student s20 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"Cosmin", "Tomulescu");
        g6.addStudent(s20);
        curs3.addGrade(new Grade(s20,"Electronica digitala"));


        Parent p30 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Petra", "Tunaru");
        Parent p31 = (Parent) UserFactory.getUser(UserFactory.UserType.Parent,"Cristian", "Tunaru");
        Student s21 = (Student) UserFactory.getUser(UserFactory.UserType.Student,"Camelia", "Tunaru");
        s21.setMother(p30);
        s21.setFather(p31);
        g6.addStudent(s21);
        curs3.addGrade(new Grade(s21,"Electronica digitala"));


        curs3.setGrupe(g6);

        curs3.setDexGrupe(g5);
        curs3.setDexGrupe(g6);

        // al patrulea curs

        Teacher t4 = (Teacher) UserFactory.getUser(UserFactory.UserType.Teacher,"Razvan", "Calinescu");
        Assistant a7 = (Assistant) UserFactory.getUser(UserFactory.UserType.Assistant,"Alma", "Toma");
        Assistant a8 = (Assistant) UserFactory.getUser(UserFactory.UserType.Assistant,"Cornel", "Cosma");

        Course curs4 = new FullCourse.FullCoursebuilder("Sisteme de operare")
                .prof(t4)
                .build();
        curs4.setAsistenti(a7);
        curs4.setAsistenti(a8);
        curs4.setStrategy("BestPartialScore");

        ///// prima grupa de la al patrulea curs

        Group g7 = new Group("311CC", a7);

        ///// adaugam studentii
        g7.addStudent(s12);
        curs4.addGrade(new Grade(s12,"Sisteme de operare"));
        g7.addStudent(s13);
        curs4.addGrade(new Grade(s13,"Sisteme de operare"));
        g7.addStudent(s14);
        curs4.addGrade(new Grade(s14,"Sisteme de operare"));
        g7.addStudent(s15);
        curs4.addGrade(new Grade(s15,"Sisteme de operare"));
        g7.addStudent(s16);
        curs4.addGrade(new Grade(s16,"Sisteme de operare"));

        curs4.setGrupe(g7);

        ///// a doua grupa de la al patrulea curs

        Group g8 = new Group("313CC", a8);

        ///// adaugam studentii
        g8.addStudent(s17);
        curs4.addGrade(new Grade(s17,"Sisteme de operare"));
        g8.addStudent(s18);
        curs4.addGrade(new Grade(s18,"Sisteme de operare"));
        g8.addStudent(s19);
        curs4.addGrade(new Grade(s19,"Sisteme de operare"));
        g8.addStudent(s20);
        curs4.addGrade(new Grade(s20,"Sisteme de operare"));
        g8.addStudent(s21);
        curs4.addGrade(new Grade(s21,"Sisteme de operare"));

        curs4.setGrupe(g8);

        curs4.setDexGrupe(g7);
        curs4.setDexGrupe(g8);

        /// adugam cursurile create in catalog

        ct.addCourse(curs1);
        ct.addCourse(curs2);
        ct.addCourse(curs3);
        ct.addCourse(curs4);

        ///////Acum incepem sa adugam in scoreVisitor notele care trebuie trecute
        ScoreVisitor sc = ct.getSc();

        ///adaugam notele de examen
        sc.setExamScores(t1,s3,"Programare Orientata pe Obiecte",2.35);
        sc.setExamScores(t1,s1,"Programare Orientata pe Obiecte",1.2);
        sc.setExamScores(t1,s5,"Programare Orientata pe Obiecte",1.6);
        sc.setExamScores(t1,s4,"Programare Orientata pe Obiecte",4.1);
        sc.setExamScores(t1,s11,"Programare Orientata pe Obiecte",2.35);
        sc.setExamScores(t1,s6,"Programare Orientata pe Obiecte",0.85);
        sc.setExamScores(t1,s7,"Programare Orientata pe Obiecte",1.5);
        sc.setExamScores(t1,s8,"Programare Orientata pe Obiecte",3.75);
        sc.setExamScores(t1,s9,"Programare Orientata pe Obiecte",5.0);
        sc.setExamScores(t1,s10,"Programare Orientata pe Obiecte",3.25);

        sc.setExamScores(t2,s3,"Paradigme de programare",1.15);
        sc.setExamScores(t2,s1,"Paradigme de programare",3.7);
        sc.setExamScores(t2,s5,"Paradigme de programare",4.0);
        sc.setExamScores(t2,s4,"Paradigme de programare",2.25);
        sc.setExamScores(t2,s11,"Paradigme de programare",2.9);
        sc.setExamScores(t2,s6,"Paradigme de programare",1.75);
        sc.setExamScores(t2,s7,"Paradigme de programare",2.25);
        sc.setExamScores(t2,s8,"Paradigme de programare",4.2);
        sc.setExamScores(t2,s9,"Paradigme de programare",3.6);
        sc.setExamScores(t2,s10,"Paradigme de programare",1.95);

        sc.setExamScores(t3,s12,"Electronica digitala",3.45);
        sc.setExamScores(t3,s13,"Electronica digitala",1.75);
        sc.setExamScores(t3,s14,"Electronica digitala",2.5);
        sc.setExamScores(t3,s15,"Electronica digitala",0.6);
        sc.setExamScores(t3,s16,"Electronica digitala",3.95);
        sc.setExamScores(t3,s17,"Electronica digitala",5.0);
        sc.setExamScores(t3,s18,"Electronica digitala",3.55);
        sc.setExamScores(t3,s19,"Electronica digitala",2.15);
        sc.setExamScores(t3,s20,"Electronica digitala",1.0);
        sc.setExamScores(t3,s21,"Electronica digitala",2.2);

        sc.setExamScores(t4,s12,"Sisteme de operare",1.65);
        sc.setExamScores(t4,s13,"Sisteme de operare",3.35);
        sc.setExamScores(t4,s14,"Sisteme de operare",2.8);
        sc.setExamScores(t4,s15,"Sisteme de operare",4.15);
        sc.setExamScores(t4,s16,"Sisteme de operare",0.55);
        sc.setExamScores(t4,s17,"Sisteme de operare",3.65);
        sc.setExamScores(t4,s18,"Sisteme de operare",2.1);
        sc.setExamScores(t4,s19,"Sisteme de operare",3.1);
        sc.setExamScores(t4,s20,"Sisteme de operare",3.3);
        sc.setExamScores(t4,s21,"Sisteme de operare",1.45);

        ///adaugam notele de partial
        sc.setPartialScores(a2,s3,"Programare Orientata pe Obiecte",3.4);
        sc.setPartialScores(a2,s1,"Programare Orientata pe Obiecte",2.75);
        sc.setPartialScores(a2,s5,"Programare Orientata pe Obiecte",3.5);
        sc.setPartialScores(a2,s4,"Programare Orientata pe Obiecte",4.85);
        sc.setPartialScores(a2,s11,"Programare Orientata pe Obiecte",2.35);

        sc.setPartialScores(a1,s6,"Programare Orientata pe Obiecte",2.15);
        sc.setPartialScores(a1,s7,"Programare Orientata pe Obiecte",0.4);
        sc.setPartialScores(a1,s8,"Programare Orientata pe Obiecte",3.65);
        sc.setPartialScores(a1,s9,"Programare Orientata pe Obiecte",4.9);
        sc.setPartialScores(a1,s10,"Programare Orientata pe Obiecte",2.1);

        sc.setPartialScores(a3,s3,"Paradigme de programare",4.35);
        sc.setPartialScores(a3,s1,"Paradigme de programare",1.25);
        sc.setPartialScores(a3,s5,"Paradigme de programare",4.65);
        sc.setPartialScores(a3,s4,"Paradigme de programare",2.1);
        sc.setPartialScores(a3,s11,"Paradigme de programare",3.4);

        sc.setPartialScores(a4,s6,"Paradigme de programare",0.7);
        sc.setPartialScores(a4,s7,"Paradigme de programare",3.25);
        sc.setPartialScores(a4,s8,"Paradigme de programare",2.45);
        sc.setPartialScores(a4,s9,"Paradigme de programare",4.25);
        sc.setPartialScores(a4,s10,"Paradigme de programare",1.3);

        sc.setPartialScores(a6,s12,"Electronica digitala",2.05);
        sc.setPartialScores(a6,s13,"Electronica digitala",4.15);
        sc.setPartialScores(a6,s14,"Electronica digitala",1.75);
        sc.setPartialScores(a6,s15,"Electronica digitala",0.85);
        sc.setPartialScores(a6,s16,"Electronica digitala",1.15);

        sc.setPartialScores(a5,s17,"Electronica digitala",3.85);
        sc.setPartialScores(a5,s18,"Electronica digitala",3.35);
        sc.setPartialScores(a5,s19,"Electronica digitala",1.6);
        sc.setPartialScores(a5,s20,"Electronica digitala",3.95);
        sc.setPartialScores(a5,s21,"Electronica digitala",2.35);

        sc.setPartialScores(a7,s12,"Sisteme de operare",3.45);
        sc.setPartialScores(a7,s13,"Sisteme de operare",2.7);
        sc.setPartialScores(a7,s14,"Sisteme de operare",3.4);
        sc.setPartialScores(a7,s15,"Sisteme de operare",2.3);
        sc.setPartialScores(a7,s16,"Sisteme de operare",3.15);

        sc.setPartialScores(a8,s17,"Sisteme de operare",2.4);
        sc.setPartialScores(a8,s18,"Sisteme de operare",3.0);
        sc.setPartialScores(a8,s19,"Sisteme de operare",0.8);
        sc.setPartialScores(a8,s20,"Sisteme de operare",1.9);
        sc.setPartialScores(a8,s21,"Sisteme de operare",4.65);

    }

    public void catevaExempleAfisare(){
        Catalog catalog = Catalog.getInstance();

        System.out.println("Afisam lista de cursuri di catalog:");
        catalog.afisareCursuri();

        ArrayList<Course> cursuri = catalog.getCursuri();
        for(Course c : cursuri){
            System.out.println(".......................................................");
            System.out.println(".....Cursul: " + c.getName() + ".....");
            System.out.println("Profesor titular:     " + c.getProfesorTitular());
            System.out.println("Asistentii:   \n{ ");
            ArrayList<Assistant> asistenti = c.getTotiAsistentii();
            for(Assistant a : asistenti){
                System.out.println(a);
            }
            System.out.println("}");
            System.out.println("...Afisare grupe cu asistentii lor...");
            HashMap<String,Group> dexGrupe = c.getGrupeDex();
            for(Map.Entry<String, Group> entry : dexGrupe.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue().getAssistant());
            }
            System.out.println("...Afisare situatie studenti...");
            HashMap<Student,Grade> situatieScolara = c.gettAllStudentGrades();
            for(Map.Entry<Student,Grade> entry : situatieScolara.entrySet()){
                System.out.println(entry.getKey() + "\n \t(Nota partial: " + entry.getValue().getPartialScore() +
                        " Nota examen: " + entry.getValue().getExamScore() + ")");
            }

        }
    }

    public void adaugareToateNoteleInCatalog(){
        Catalog catalog = Catalog.getInstance();

        for(Teacher t : catalog.getAllTeachers()){
            catalog.getSc().visit(t);
        }
        for(Assistant a : catalog.getAllAssistants()){
            catalog.getSc().visit(a);
        }
    }

    public void adaugareNoteAsisst(){
        for(Assistant a : Catalog.getInstance().getAllAssistants()){
            Catalog.getInstance().getSc().visit(a);
        }
    }

    public void adaugareNoteProf(){
        for(Teacher t : Catalog.getInstance().getAllTeachers()){
            Catalog.getInstance().getSc().visit(t);
        }
    }

    public void demoBackUP(){
        TestareSiAfisari obiect = new TestareSiAfisari();
        Catalog catalog = Catalog.getInstance();
        obiect.adaugareNoteAsisst();

        for(Course c : catalog.getCursuri()){
            c.makeBackup();
        }

        obiect.catevaExempleAfisare();
        obiect.adaugareToateNoteleInCatalog();
        obiect.catevaExempleAfisare();

        for(Course c : catalog.getCursuri()){
            c.undo();
        }

        obiect.catevaExempleAfisare();

        System.out.println("\n\nAfisare toate notele netrecute");
        catalog.getSc().afisareExamenScores();
        catalog.getSc().afisarePartialScores();
    }

    public void afisareNotificariParinti(){
        Catalog catalog = Catalog.getInstance();
        for(Course c : catalog.getCursuri()){
            for(Student s : c.getAllStudents()){
                System.out.println("\n\n" + s + "--------------Parintii cu notificarile:  -----");
                System.out.println("Mother:");
                if(s.getMother() != null){
                    for(Notification n : s.getMother().getNotificari()){
                        s.getMother().afisareNotificare(n);
                    }
                } else System.out.println("............");

                System.out.println("Father");
                if(s.getFather() != null){
                    for(Notification n : s.getFather().getNotificari()){
                        s.getFather().afisareNotificare(n);
                    }
                }else System.out.println("............");

            }
        }
    }

    public void ceiMainBuniElevi(){
        for(Course c : Catalog.getInstance().getCursuri()){
            System.out.println(String.valueOf(c.getBestStudent()) + " + Strategia folosita: " + c.getStrategy());
        }
    }

    public void exempleRulare(){
        Catalog catalog = Catalog.getInstance();
        TestareSiAfisari obiect = new TestareSiAfisari();

        /// adaugarea datelor din json in Catalog
        obiect.adaugareDateCatalog();

        //demonstratie ca merge demoul
//        obiect.demoBackUP();

        //exemple de Afisare dupa ce toate notele au fost adaugate
        obiect.adaugareToateNoteleInCatalog();
        obiect.catevaExempleAfisare();

//        obiect.afisareNotificariParinti();

        for(Course c : catalog.getCursuri()){
            System.out.println("Nume curs: " + c.getName());
            int contor = 0;
            for(Student s : c.getGraduatedStudents()){
                contor++;
                System.out.println(s.getFirstName() + s.getLastName());
            }
            System.out.println("Au promovat " + contor + " studenti din 10");
        }


        System.out.println("\n Afisare cei mai buni elevi dupa strategiile profesorilor:");
        obiect.ceiMainBuniElevi();
    }
}
