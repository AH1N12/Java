package Equals;

public class class1 {
String a = "a";
String drugieA = "a"; // zarowno a jak i 2 a pokazuja na to same mijesce w pamieci
//oba sa zmiennymi iteralowymi a pamiec dla zmiennych iteralowych nie tworzy nowych obiektow jesli maja taka sama wartosc
//tylko przypisuje im referencje

String noweA = new String("a"); // w ten sposob tworzymy oddzielne obiekty

//noweA.equals(drugieA); zwraca true bo oba to stringi
//noweA.==drugieA; zwraca false bo to rozne miejsca w pamieci
//a==noweA zwraca true bo to samo miejsce w pamieci
}
