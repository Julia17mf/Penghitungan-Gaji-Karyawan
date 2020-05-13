public class GajiModel {
    private String id, nama, posisi, alamat, hp, gaji, jam, tunjangan, pajak, total;

    public void setGajiModel(String id, String nama, String posisi, String alamat, String hp, String gaji, String jam, String tunjangan, String pajak, String total) {
        this.id         = id;
        this.nama       = nama;
        this.posisi     = posisi;
        this.alamat     = alamat;
        this.hp         = hp;
        this.gaji       = gaji;
        this.jam        = jam;
        this.tunjangan  = tunjangan;
        this.pajak      = pajak;
        this.total      = total;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getPosisi() {
        return posisi;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getHp() {
        return hp;
    }

    public String getGaji() {
        return gaji;
    }

    public String getJam() {
        return jam;
    }

    public String getTunjangan() {
        return tunjangan;
    }

    public String getPajak() {
        return pajak;
    }

    public String getTotal() {
        return total;
    }
}
