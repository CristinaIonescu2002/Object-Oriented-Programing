# Ionescu Cristina 323CC

###Gradul de dificultate al temei:
8, pentru mine partea de interfata grafica a fost mai grea

###Timpul alocat rezolvarii:
2 saptamani

###Modul de rezolvare a temei:
#### ! Voi mentiona doar ce am modificat sau adaugat pe langa cerintele temei

#####   Catalog:
- am adaugat o referinta la ScoreVisor pentru a imi fi mai usor sa trec notele noi in
catalog
- o functie care returneaza o lista cu toti asistentii
- o functie care returneaza toti profesorii

#####   Student:

- la mine, aceasta clasa implementeasa Subject (pentru ca notele vor fi vazute de parinti)
si Comparable
- am rescris aici functiile de "addObserver", "removeObserver" si "notifyObservers"
- tot aici mai retin o lista de observeri (care va contine parintii lui ca observeri)

#####   Parent:

- va contine un ArrayList de notificari care va contine notificarile nevalidate ale
parintelui

#####   Teacher:

- aceasta clasa este una din cele care va implementa "Element" deoarece profesorul este 
cel care va trece nota de la examen in catalog

#####    Assistant:

- si aceasta clasa implementeaza "Element" deoarece si asistentii vor trece notele de la 
partial in catalog

#####    Notification:

- aici nu am facut cine stie ce modificare
- am adaugat un string "notificare" care va contine notificarea in sine, cu numele, cursul
si notele studentului.

#####   Course:

- pentru asistenti am folosit un HashSet
- pentru note un ArrayList
- pentru dictionarul de Grupe un HashMap
- pentru stategie am un strategy de tip Strategy, voi primi strategia ca Sting si in functie 
de ce strategie se doreste, strategy va contine referinta catre clasa respectiva
- tot aici avem si snapchot de tip Snapshot care va contine backup-ul de note

#####    ScoreVisitor:

- eu am gandit ca in cele doua dictionare sa se afle doar notele care vor trebui sa fie trecute
in catalog pentru examen si pentru partial
- functia de visit pentru Assistant: va trece toate notele acelui asistent in catalog, notificand
si parintii in acelasi timp, si va sterge notele din dictionarul de note pentru partial
- functia de visit pentru Teacher: va trece toate notele acelui profesor, va notifica parintii si
va sterge notele din dictionarul de note pentru examen

#####   TesteSiAfisari:

- aici adaug datele din catalog
- sunt cateva exemple de afisari care sa arate ca este totul functional

#####   Main:

-aici am facut cat am putut din interfata grafica
- am incercat sa fac ceva pentru student (am ales un student pe care sa fac testarea mereu si lui
i-am facut pagina), tinang cont ca in idee ar trebui inainte sa fie o pagina de login, asa am face
rost de numele studentului si automant am seta si lista sa contina doar cursurile pe care acesta le
are
- acum apar toate cursurile, doar ca va aparea un mesaj cand elevul vrea sa apese pe un curs pe care
nu il face

- la celelalte ferestre doar am adaugat buton de inapoi si titlu, pentru ca nu am mai aput
- ele merg pe acelasi principiu, am pus acolo un nume, dar se presupune ca asistentul sau profesorul 
sau parintele va fi primit prin login

- la Teacher am mai adaugat si studentii pe care ii are

#####   Altele:

! Am scris pe ultima suta de metri README-ul si posibil sa fi ratat cate ceva
