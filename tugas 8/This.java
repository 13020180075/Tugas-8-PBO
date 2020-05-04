/*
nama : ilfah sahra
tanggal : 5 april 2020
waktu : 16.00
*/

public class This{
String Nama, Alamat;
void biodata(String Nama, String Alamat){
this.Nama = Nama;
this.Alamat = Alamat;
}
public static void main(String[] args){
This bio = new This();
bio.biodata("Ilfah Sahra","Maros");
System.out.println("Nama : " + bio.Nama);
System.out.println("Alamat : " + bio.Alamat);
}
}

