package main.featureGUI.introGUI;

public enum EnumPanels {
    HALAMANUTAMA(1),
    PENDAFTARANMEMBER(2),
    PEMBAYARAN(3),
    UPDATEMEMBER(4),
    HISTORITRANSAKSI(5),
    GUDANG(6),
    SETTING(7),
    LAPORANPENJUALAN(8);

    public final Integer value;

    private EnumPanels(Integer value){
        this.value = value;
    }
}
