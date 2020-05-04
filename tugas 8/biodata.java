/*
nama : ilfah sahra
tanggal : 5 april 2020
waktu : 16.00
*/

 public class biodata  {
    private String nidn;
    private String nama;
private String jurusan;
private String email;

	

    // ini method setter
    public void setNind(String nidn){
        this.nidn = nidn;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

	public void setJurusan(String jurusan){
        this.jurusan = jurusan ;
    }
	public void setEmail(String email){
        this.email = email ;
    }

    // ini method getter
    public String getNidn(){
        return this.nidn;
    }

    public String getNama(){
        return this.nama;
    }

 public String getJurusan(){
        return this.jurusan;
    }

 public String getEmail(){
        return this.email;
    }
}
