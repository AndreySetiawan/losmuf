package id.atiila.losmuf;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DataNasabah implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Cabang Asal")
	private java.lang.String cbgAsal;

	@org.kie.api.definition.type.Label("Approval Level")
	private java.lang.Integer aprLevel;

	@org.kie.api.definition.type.Label("Approval Function")
	private java.lang.String aprFunction;

	@org.kie.api.definition.type.Label("Approval Plafond")
	private java.lang.String aprPlafond;

	@org.kie.api.definition.type.Label("Jumlah Overdue Sebelumnya")
	private java.lang.Integer ovdSebelum;

	@org.kie.api.definition.type.Label("Usia Kendaraan")
	private java.lang.Integer usiaKend;

	@org.kie.api.definition.type.Label("Jenis Indentitas")
	private String jnsIndentitas;

	@org.kie.api.definition.type.Label("Nama Debitur")
	private java.lang.String namaDebitur;

	@org.kie.api.definition.type.Label("Approval Result")
	private String aprResult;

	@org.kie.api.definition.type.Label("Approval Function Rating")
	private String aprFunctionRating;

	@org.kie.api.definition.type.Label("Status Pengajuan Aplikasi Sebelumnya")
	private String stsAplikasiSebelum;

	@org.kie.api.definition.type.Label("Status Kontrak")
	private String stsKontrak;

	@org.kie.api.definition.type.Label("Jenis Pembiayaan")
	private String jnsPembiayaan;

	@org.kie.api.definition.type.Label("Portofolio")
	private String portofolio;

	@org.kie.api.definition.type.Label("Cara Pembayaran Angsuran")
	private String caraBayarAngs;

	@org.kie.api.definition.type.Label("Channel Rating")
	private String channelRating;

	@org.kie.api.definition.type.Label("Sales Officer Rating")
	private String salesOfficeRating;

	@org.kie.api.definition.type.Label("Jenis Sumber Nasabah")
	private String jnsSumberNsbh;

	@org.kie.api.definition.type.Label("Object Kendaraan")
	private String objKend;

	@org.kie.api.definition.type.Label("Tipe Kendaraan")
	private String tipeKend;

	@org.kie.api.definition.type.Label("Merk Kendaraan")
	private String merkKend;

	@org.kie.api.definition.type.Label("Kategori Kendaraan")
	private String kategoriKend;

	@org.kie.api.definition.type.Label("Usia Debitur")
	private java.lang.Integer usiaDebitur;

	@org.kie.api.definition.type.Label("Pekerjaan Debitur")
	private java.lang.String kerjaDebitur;

	@org.kie.api.definition.type.Label("Lama Bekerja Debitur")
	private java.lang.Integer lamaKerja;

	@org.kie.api.definition.type.Label("Jenis Nasabah")
	private String jnsNasabah;

	@org.kie.api.definition.type.Label("Jumlah Tanggungan")
	private java.lang.Integer jmlhTanggungan;

	@org.kie.api.definition.type.Label("Status Pernikahan")
	private String stsPernikahan;

	@org.kie.api.definition.type.Label("Lama Tinggal Debitur")
	private java.lang.Integer lamaTinggal;

	@org.kie.api.definition.type.Label("Status Kepemilikan Rumah")
	private String stsPemilikanRumah;

	@org.kie.api.definition.type.Label("Daya Listrik Pada Rumah Tinggal")
	private java.lang.Integer dayaListrik;

	@org.kie.api.definition.type.Label("Tipe Jalan Rumah Tinggal")
	private java.lang.String tipeJlnRumah;

	@org.kie.api.definition.type.Label("Nilai Debt Service Ratio")
	private java.lang.Integer nilDebtServiceRatio;

	@org.kie.api.definition.type.Label("Nilai Debt Income Ratio")
	private java.lang.Integer nilDebtIncomeRatio;

	@org.kie.api.definition.type.Label("Pokok Hutang")
	private java.lang.Integer pokHutang;

	@org.kie.api.definition.type.Label("Tenor Kredit")
	private java.lang.Integer tenorKredit;

	@org.kie.api.definition.type.Label("Amount Down Payment")
	private java.lang.Integer amountDP;

	@org.kie.api.definition.type.Label("Installment Type")
	private String installmentType;

	@org.kie.api.definition.type.Label("Credit Scheme")
	private java.lang.String creditScheme;

	@org.kie.api.definition.type.Label("Total Unit Kendaraan")
	private java.lang.Integer totalUnitKend;

	@org.kie.api.definition.type.Label("Skor Mobil Pernikahan Pemilikan Rumah")
	private java.lang.Integer skorMobilPernikahanPemilikanRumah;

	@org.kie.api.definition.type.Label("Skor Mobil Lama Kerja")
	private java.lang.Integer skorMobilLamaKerja;

	@org.kie.api.definition.type.Label("Skor Mobil Kerja Debitur Usia Kendaraan")
	private java.lang.Integer skorMobilKerjaDebiturUsiaKendaraan;

	@org.kie.api.definition.type.Label("Skor Pemilikan Rumah Pekerjaan")
	private java.lang.Integer skorPemilikanRumahPekerjaan;

	@org.kie.api.definition.type.Label("Skor Status Pernikahan")
	private Integer skorStatusPernikahan;

	@org.kie.api.definition.type.Label("Ratio")
	private Double ratio;

	@org.kie.api.definition.type.Label("LTV")
	private java.lang.Integer ltv;

	@org.kie.api.definition.type.Label("Skor Installment OTR Ratio")
	private java.lang.Integer skorInstallmentOTRRatio;

	@org.kie.api.definition.type.Label("Skor Lama Kerja")
	private java.lang.Integer skorLamaKerja;

	@org.kie.api.definition.type.Label("Skor Ltv")
	private java.lang.Integer skorLtv;

	@org.kie.api.definition.type.Label("Skor Tenor Portofolio")
	private java.lang.Integer skorTenorPortofolio;

	@org.kie.api.definition.type.Label("DSR")
	private Double dsr;

	@org.kie.api.definition.type.Label("Skor Mobil DSR Tenor")
	private java.lang.Integer skorMobilDSRTenor;

	@org.kie.api.definition.type.Label("Skor Mobil LTV")
	private java.lang.Integer skorMobilLTV;

	@org.kie.api.definition.type.Label("Skor Mobil Monthly Installment Index")
	private java.lang.Integer skorMobilMonthlyInstallmentIndex;

	@org.kie.api.definition.type.Label("Skor Mobil Monthly Installment OTR Portofolio")
	private java.lang.Integer skorMobilMonthlyInstallmentOTRPortofolio;

	@org.kie.api.definition.type.Label("Installment OTR")
	private java.lang.Integer installmentOTR;

	@org.kie.api.definition.type.Label(value = "Installment Index")
	private java.lang.Integer installmentIndex;

	public DataNasabah() {
	}

	public java.lang.String getCbgAsal() {
		return this.cbgAsal;
	}

	public void setCbgAsal(java.lang.String cbgAsal) {
		this.cbgAsal = cbgAsal;
	}

	public java.lang.Integer getAprLevel() {
		return this.aprLevel;
	}

	public void setAprLevel(java.lang.Integer aprLevel) {
		this.aprLevel = aprLevel;
	}

	public java.lang.String getAprFunction() {
		return this.aprFunction;
	}

	public void setAprFunction(java.lang.String aprFunction) {
		this.aprFunction = aprFunction;
	}

	public java.lang.String getAprPlafond() {
		return this.aprPlafond;
	}

	public void setAprPlafond(java.lang.String aprPlafond) {
		this.aprPlafond = aprPlafond;
	}

	public java.lang.Integer getOvdSebelum() {
		return this.ovdSebelum;
	}

	public void setOvdSebelum(java.lang.Integer ovdSebelum) {
		this.ovdSebelum = ovdSebelum;
	}

	public java.lang.Integer getUsiaKend() {
		return this.usiaKend;
	}

	public void setUsiaKend(java.lang.Integer usiaKend) {
		this.usiaKend = usiaKend;
	}

	public java.lang.String getNamaDebitur() {
		return this.namaDebitur;
	}

	public void setNamaDebitur(java.lang.String namaDebitur) {
		this.namaDebitur = namaDebitur;
	}

	public java.lang.String getMerkKend() {
		return this.merkKend;
	}

	public void setMerkKend(java.lang.String merkKend) {
		this.merkKend = merkKend;
	}

	public java.lang.Integer getUsiaDebitur() {
		return this.usiaDebitur;
	}

	public void setUsiaDebitur(java.lang.Integer usiaDebitur) {
		this.usiaDebitur = usiaDebitur;
	}

	public java.lang.String getKerjaDebitur() {
		return this.kerjaDebitur;
	}

	public void setKerjaDebitur(java.lang.String kerjaDebitur) {
		this.kerjaDebitur = kerjaDebitur;
	}

	public java.lang.Integer getLamaKerja() {
		return this.lamaKerja;
	}

	public void setLamaKerja(java.lang.Integer lamaKerja) {
		this.lamaKerja = lamaKerja;
	}

	public java.lang.Integer getJmlhTanggungan() {
		return this.jmlhTanggungan;
	}

	public void setJmlhTanggungan(java.lang.Integer jmlhTanggungan) {
		this.jmlhTanggungan = jmlhTanggungan;
	}

	public java.lang.Integer getLamaTinggal() {
		return this.lamaTinggal;
	}

	public void setLamaTinggal(java.lang.Integer lamaTinggal) {
		this.lamaTinggal = lamaTinggal;
	}

	public java.lang.Integer getDayaListrik() {
		return this.dayaListrik;
	}

	public void setDayaListrik(java.lang.Integer dayaListrik) {
		this.dayaListrik = dayaListrik;
	}

	public java.lang.String getTipeJlnRumah() {
		return this.tipeJlnRumah;
	}

	public void setTipeJlnRumah(java.lang.String tipeJlnRumah) {
		this.tipeJlnRumah = tipeJlnRumah;
	}

	public java.lang.Integer getNilDebtServiceRatio() {
		return this.nilDebtServiceRatio;
	}

	public void setNilDebtServiceRatio(java.lang.Integer nilDebtServiceRatio) {
		this.nilDebtServiceRatio = nilDebtServiceRatio;
	}

	public java.lang.Integer getNilDebtIncomeRatio() {
		return this.nilDebtIncomeRatio;
	}

	public void setNilDebtIncomeRatio(java.lang.Integer nilDebtIncomeRatio) {
		this.nilDebtIncomeRatio = nilDebtIncomeRatio;
	}

	public java.lang.Integer getPokHutang() {
		return this.pokHutang;
	}

	public void setPokHutang(java.lang.Integer pokHutang) {
		this.pokHutang = pokHutang;
	}

	public java.lang.Integer getTenorKredit() {
		return this.tenorKredit;
	}

	public void setTenorKredit(java.lang.Integer tenorKredit) {
		this.tenorKredit = tenorKredit;
	}

	public java.lang.Integer getAmountDP() {
		return this.amountDP;
	}

	public void setAmountDP(java.lang.Integer amountDP) {
		this.amountDP = amountDP;
	}

	public java.lang.String getCreditScheme() {
		return this.creditScheme;
	}

	public void setCreditScheme(java.lang.String creditScheme) {
		this.creditScheme = creditScheme;
	}

	public java.lang.Integer getTotalUnitKend() {
		return this.totalUnitKend;
	}

	public void setTotalUnitKend(java.lang.Integer totalUnitKend) {
		this.totalUnitKend = totalUnitKend;
	}

	public java.lang.Integer getSkorMobilPernikahanPemilikanRumah() {
		return this.skorMobilPernikahanPemilikanRumah;
	}

	public void setSkorMobilPernikahanPemilikanRumah(
			java.lang.Integer skorMobilPernikahanPemilikanRumah) {
		this.skorMobilPernikahanPemilikanRumah = skorMobilPernikahanPemilikanRumah;
	}

	public java.lang.Integer getSkorMobilLamaKerja() {
		return this.skorMobilLamaKerja;
	}

	public void setSkorMobilLamaKerja(java.lang.Integer skorMobilLamaKerja) {
		this.skorMobilLamaKerja = skorMobilLamaKerja;
	}

	public java.lang.Integer getSkorMobilKerjaDebiturUsiaKendaraan() {
		return this.skorMobilKerjaDebiturUsiaKendaraan;
	}

	public void setSkorMobilKerjaDebiturUsiaKendaraan(
			java.lang.Integer skorMobilKerjaDebiturUsiaKendaraan) {
		this.skorMobilKerjaDebiturUsiaKendaraan = skorMobilKerjaDebiturUsiaKendaraan;
	}

	public java.lang.Integer getSkorPemilikanRumahPekerjaan() {
		return this.skorPemilikanRumahPekerjaan;
	}

	public void setSkorPemilikanRumahPekerjaan(
			java.lang.Integer skorPemilikanRumahPekerjaan) {
		this.skorPemilikanRumahPekerjaan = skorPemilikanRumahPekerjaan;
	}

	public java.lang.String getStsAplikasiSebelum() {
		return this.stsAplikasiSebelum;
	}

	public void setStsAplikasiSebelum(java.lang.String stsAplikasiSebelum) {
		this.stsAplikasiSebelum = stsAplikasiSebelum;
	}

	public java.lang.String getStsKontrak() {
		return this.stsKontrak;
	}

	public void setStsKontrak(java.lang.String stsKontrak) {
		this.stsKontrak = stsKontrak;
	}

	public java.lang.String getPortofolio() {
		return this.portofolio;
	}

	public void setPortofolio(java.lang.String portofolio) {
		this.portofolio = portofolio;
	}

	public java.lang.String getSalesOfficeRating() {
		return this.salesOfficeRating;
	}

	public void setSalesOfficeRating(java.lang.String salesOfficeRating) {
		this.salesOfficeRating = salesOfficeRating;
	}

	public java.lang.String getTipeKend() {
		return this.tipeKend;
	}

	public void setTipeKend(java.lang.String tipeKend) {
		this.tipeKend = tipeKend;
	}

	public java.lang.String getStsPernikahan() {
		return this.stsPernikahan;
	}

	public void setStsPernikahan(java.lang.String stsPernikahan) {
		this.stsPernikahan = stsPernikahan;
	}

	public java.lang.String getStsPemilikanRumah() {
		return this.stsPemilikanRumah;
	}

	public void setStsPemilikanRumah(java.lang.String stsPemilikanRumah) {
		this.stsPemilikanRumah = stsPemilikanRumah;
	}

	public java.lang.String getJnsIndentitas() {
		return this.jnsIndentitas;
	}

	public void setJnsIndentitas(java.lang.String jnsIndentitas) {
		this.jnsIndentitas = jnsIndentitas;
	}

	public java.lang.String getAprResult() {
		return this.aprResult;
	}

	public void setAprResult(java.lang.String aprResult) {
		this.aprResult = aprResult;
	}

	public java.lang.String getAprFunctionRating() {
		return this.aprFunctionRating;
	}

	public void setAprFunctionRating(java.lang.String aprFunctionRating) {
		this.aprFunctionRating = aprFunctionRating;
	}

	public java.lang.String getJnsPembiayaan() {
		return this.jnsPembiayaan;
	}

	public void setJnsPembiayaan(java.lang.String jnsPembiayaan) {
		this.jnsPembiayaan = jnsPembiayaan;
	}

	public java.lang.String getCaraBayarAngs() {
		return this.caraBayarAngs;
	}

	public void setCaraBayarAngs(java.lang.String caraBayarAngs) {
		this.caraBayarAngs = caraBayarAngs;
	}

	public java.lang.String getChannelRating() {
		return this.channelRating;
	}

	public void setChannelRating(java.lang.String channelRating) {
		this.channelRating = channelRating;
	}

	public java.lang.String getJnsSumberNsbh() {
		return this.jnsSumberNsbh;
	}

	public void setJnsSumberNsbh(java.lang.String jnsSumberNsbh) {
		this.jnsSumberNsbh = jnsSumberNsbh;
	}

	public java.lang.String getObjKend() {
		return this.objKend;
	}

	public void setObjKend(java.lang.String objKend) {
		this.objKend = objKend;
	}

	public java.lang.String getKategoriKend() {
		return this.kategoriKend;
	}

	public void setKategoriKend(java.lang.String kategoriKend) {
		this.kategoriKend = kategoriKend;
	}

	public java.lang.String getJnsNasabah() {
		return this.jnsNasabah;
	}

	public void setJnsNasabah(java.lang.String jnsNasabah) {
		this.jnsNasabah = jnsNasabah;
	}

	public java.lang.String getInstallmentType() {
		return this.installmentType;
	}

	public void setInstallmentType(java.lang.String installmentType) {
		this.installmentType = installmentType;
	}

	public java.lang.Integer getSkorStatusPernikahan() {
		return this.skorStatusPernikahan;
	}

	public void setSkorStatusPernikahan(java.lang.Integer skorStatusPernikahan) {
		this.skorStatusPernikahan = skorStatusPernikahan;
	}

	public java.lang.Integer getLtv() {
		return this.ltv;
	}

	public void setLtv(java.lang.Integer ltv) {
		this.ltv = ltv;
	}

	public java.lang.Integer getSkorInstallmentOTRRatio() {
		return this.skorInstallmentOTRRatio;
	}

	public void setSkorInstallmentOTRRatio(
			java.lang.Integer skorInstallmentOTRRatio) {
		this.skorInstallmentOTRRatio = skorInstallmentOTRRatio;
	}

	public java.lang.Integer getSkorLamaKerja() {
		return this.skorLamaKerja;
	}

	public void setSkorLamaKerja(java.lang.Integer skorLamaKerja) {
		this.skorLamaKerja = skorLamaKerja;
	}

	public java.lang.Integer getSkorLtv() {
		return this.skorLtv;
	}

	public void setSkorLtv(java.lang.Integer skorLtv) {
		this.skorLtv = skorLtv;
	}

	public java.lang.Integer getSkorTenorPortofolio() {
		return this.skorTenorPortofolio;
	}

	public void setSkorTenorPortofolio(java.lang.Integer skorTenorPortofolio) {
		this.skorTenorPortofolio = skorTenorPortofolio;
	}

	public java.lang.Integer getSkorMobilDSRTenor() {
		return this.skorMobilDSRTenor;
	}

	public void setSkorMobilDSRTenor(java.lang.Integer skorMobilDSRTenor) {
		this.skorMobilDSRTenor = skorMobilDSRTenor;
	}

	public java.lang.Integer getSkorMobilLTV() {
		return this.skorMobilLTV;
	}

	public void setSkorMobilLTV(java.lang.Integer skorMobilLTV) {
		this.skorMobilLTV = skorMobilLTV;
	}

	public java.lang.Integer getSkorMobilMonthlyInstallmentIndex() {
		return this.skorMobilMonthlyInstallmentIndex;
	}

	public void setSkorMobilMonthlyInstallmentIndex(
			java.lang.Integer skorMobilMonthlyInstallmentIndex) {
		this.skorMobilMonthlyInstallmentIndex = skorMobilMonthlyInstallmentIndex;
	}

	public java.lang.Double getRatio() {
		return this.ratio;
	}

	public void setRatio(java.lang.Double ratio) {
		this.ratio = ratio;
	}

	public java.lang.Double getDsr() {
		return this.dsr;
	}

	public void setDsr(java.lang.Double dsr) {
		this.dsr = dsr;
	}

	public java.lang.Integer getSkorMobilMonthlyInstallmentOTRPortofolio() {
		return this.skorMobilMonthlyInstallmentOTRPortofolio;
	}

	public void setSkorMobilMonthlyInstallmentOTRPortofolio(
			java.lang.Integer skorMobilMonthlyInstallmentOTRPortofolio) {
		this.skorMobilMonthlyInstallmentOTRPortofolio = skorMobilMonthlyInstallmentOTRPortofolio;
	}

	public java.lang.Integer getInstallmentOTR() {
		return this.installmentOTR;
	}

	public void setInstallmentOTR(java.lang.Integer installmentOTR) {
		this.installmentOTR = installmentOTR;
	}

	public java.lang.Integer getInstallmentIndex() {
		return this.installmentIndex;
	}

	public void setInstallmentIndex(java.lang.Integer installmentIndex) {
		this.installmentIndex = installmentIndex;
	}

	public DataNasabah(java.lang.String cbgAsal, java.lang.Integer aprLevel,
			java.lang.String aprFunction, java.lang.String aprPlafond,
			java.lang.Integer ovdSebelum, java.lang.Integer usiaKend,
			java.lang.String jnsIndentitas, java.lang.String namaDebitur,
			java.lang.String aprResult, java.lang.String aprFunctionRating,
			java.lang.String stsAplikasiSebelum, java.lang.String stsKontrak,
			java.lang.String jnsPembiayaan, java.lang.String portofolio,
			java.lang.String caraBayarAngs, java.lang.String channelRating,
			java.lang.String salesOfficeRating, java.lang.String jnsSumberNsbh,
			java.lang.String objKend, java.lang.String tipeKend,
			java.lang.String merkKend, java.lang.String kategoriKend,
			java.lang.Integer usiaDebitur, java.lang.String kerjaDebitur,
			java.lang.Integer lamaKerja, java.lang.String jnsNasabah,
			java.lang.Integer jmlhTanggungan, java.lang.String stsPernikahan,
			java.lang.Integer lamaTinggal, java.lang.String stsPemilikanRumah,
			java.lang.Integer dayaListrik, java.lang.String tipeJlnRumah,
			java.lang.Integer nilDebtServiceRatio,
			java.lang.Integer nilDebtIncomeRatio, java.lang.Integer pokHutang,
			java.lang.Integer tenorKredit, java.lang.Integer amountDP,
			java.lang.String installmentType, java.lang.String creditScheme,
			java.lang.Integer totalUnitKend,
			java.lang.Integer skorMobilPernikahanPemilikanRumah,
			java.lang.Integer skorMobilLamaKerja,
			java.lang.Integer skorMobilKerjaDebiturUsiaKendaraan,
			java.lang.Integer skorPemilikanRumahPekerjaan,
			java.lang.Integer skorStatusPernikahan, java.lang.Double ratio,
			java.lang.Integer ltv, java.lang.Integer skorInstallmentOTRRatio,
			java.lang.Integer skorLamaKerja, java.lang.Integer skorLtv,
			java.lang.Integer skorTenorPortofolio, java.lang.Double dsr,
			java.lang.Integer skorMobilDSRTenor,
			java.lang.Integer skorMobilLTV,
			java.lang.Integer skorMobilMonthlyInstallmentIndex,
			java.lang.Integer skorMobilMonthlyInstallmentOTRPortofolio,
			java.lang.Integer installmentOTR, java.lang.Integer installmentIndex) {
		this.cbgAsal = cbgAsal;
		this.aprLevel = aprLevel;
		this.aprFunction = aprFunction;
		this.aprPlafond = aprPlafond;
		this.ovdSebelum = ovdSebelum;
		this.usiaKend = usiaKend;
		this.jnsIndentitas = jnsIndentitas;
		this.namaDebitur = namaDebitur;
		this.aprResult = aprResult;
		this.aprFunctionRating = aprFunctionRating;
		this.stsAplikasiSebelum = stsAplikasiSebelum;
		this.stsKontrak = stsKontrak;
		this.jnsPembiayaan = jnsPembiayaan;
		this.portofolio = portofolio;
		this.caraBayarAngs = caraBayarAngs;
		this.channelRating = channelRating;
		this.salesOfficeRating = salesOfficeRating;
		this.jnsSumberNsbh = jnsSumberNsbh;
		this.objKend = objKend;
		this.tipeKend = tipeKend;
		this.merkKend = merkKend;
		this.kategoriKend = kategoriKend;
		this.usiaDebitur = usiaDebitur;
		this.kerjaDebitur = kerjaDebitur;
		this.lamaKerja = lamaKerja;
		this.jnsNasabah = jnsNasabah;
		this.jmlhTanggungan = jmlhTanggungan;
		this.stsPernikahan = stsPernikahan;
		this.lamaTinggal = lamaTinggal;
		this.stsPemilikanRumah = stsPemilikanRumah;
		this.dayaListrik = dayaListrik;
		this.tipeJlnRumah = tipeJlnRumah;
		this.nilDebtServiceRatio = nilDebtServiceRatio;
		this.nilDebtIncomeRatio = nilDebtIncomeRatio;
		this.pokHutang = pokHutang;
		this.tenorKredit = tenorKredit;
		this.amountDP = amountDP;
		this.installmentType = installmentType;
		this.creditScheme = creditScheme;
		this.totalUnitKend = totalUnitKend;
		this.skorMobilPernikahanPemilikanRumah = skorMobilPernikahanPemilikanRumah;
		this.skorMobilLamaKerja = skorMobilLamaKerja;
		this.skorMobilKerjaDebiturUsiaKendaraan = skorMobilKerjaDebiturUsiaKendaraan;
		this.skorPemilikanRumahPekerjaan = skorPemilikanRumahPekerjaan;
		this.skorStatusPernikahan = skorStatusPernikahan;
		this.ratio = ratio;
		this.ltv = ltv;
		this.skorInstallmentOTRRatio = skorInstallmentOTRRatio;
		this.skorLamaKerja = skorLamaKerja;
		this.skorLtv = skorLtv;
		this.skorTenorPortofolio = skorTenorPortofolio;
		this.dsr = dsr;
		this.skorMobilDSRTenor = skorMobilDSRTenor;
		this.skorMobilLTV = skorMobilLTV;
		this.skorMobilMonthlyInstallmentIndex = skorMobilMonthlyInstallmentIndex;
		this.skorMobilMonthlyInstallmentOTRPortofolio = skorMobilMonthlyInstallmentOTRPortofolio;
		this.installmentOTR = installmentOTR;
		this.installmentIndex = installmentIndex;
	}

}