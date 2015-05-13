package com.google.gwt.i18n.client;

import com.google.gwt.i18n.client.impl.CurrencyDataImpl;
import com.google.gwt.core.client.JavaScriptObject;
import java.util.HashMap;

public class CurrencyList_pt extends com.google.gwt.i18n.client.CurrencyList_ {
  
  @Override
  protected CurrencyData getDefaultJava() {
    return new CurrencyDataImpl("AOA", "Kz", 2);
  }
  
  @Override
  protected native CurrencyData getDefaultNative() /*-{
    return [ "AOA", "Kz", 2];
  }-*/;
  
  @Override
  protected HashMap<String, CurrencyData> loadCurrencyMapJava() {
    HashMap<String, CurrencyData> result = super.loadCurrencyMapJava();
    // Peseta de Andorra
    result.put("ADP", new CurrencyDataImpl("ADP", "ADP", 128));
    // Dirém dos Emirados Árabes Unidos
    result.put("AED", new CurrencyDataImpl("AED", "DH", 2, "DH"));
    // Afegane (1927-2002)
    result.put("AFA", new CurrencyDataImpl("AFA", "AFA", 130));
    // Afegane
    result.put("AFN", new CurrencyDataImpl("AFN", "Af", 0));
    // Lek Albanês
    result.put("ALL", new CurrencyDataImpl("ALL", "ALL", 0));
    // Dram armênio
    result.put("AMD", new CurrencyDataImpl("AMD", "AMD", 0));
    // Guilder das Antilhas Holandesas
    result.put("ANG", new CurrencyDataImpl("ANG", "NAf.", 2));
    // Cuanza angolano
    result.put("AOA", new CurrencyDataImpl("AOA", "Kz", 2));
    // Cuanza angolano (1977-1990)
    result.put("AOK", new CurrencyDataImpl("AOK", "AOK", 130));
    // Novo cuanza angolano (1990-2000)
    result.put("AON", new CurrencyDataImpl("AON", "AON", 130));
    // Cuanza angolano reajustado (1995-1999)
    result.put("AOR", new CurrencyDataImpl("AOR", "AOR", 130));
    // Austral argentino
    result.put("ARA", new CurrencyDataImpl("ARA", "₳", 130));
    // ARL
    result.put("ARL", new CurrencyDataImpl("ARL", "$L", 130));
    // ARM
    result.put("ARM", new CurrencyDataImpl("ARM", "m$n", 130));
    // Peso argentino (1983-1985)
    result.put("ARP", new CurrencyDataImpl("ARP", "ARP", 130));
    // Peso argentino
    result.put("ARS", new CurrencyDataImpl("ARS", "AR$", 2, "AR$"));
    // Xelim austríaco
    result.put("ATS", new CurrencyDataImpl("ATS", "ATS", 130));
    // Dólar australiano
    result.put("AUD", new CurrencyDataImpl("AUD", "AU$", 2, "AU$"));
    // Guilder de Aruba
    result.put("AWG", new CurrencyDataImpl("AWG", "Afl.", 2));
    // Manat azerbaijano
    result.put("AZM", new CurrencyDataImpl("AZM", "AZM", 130));
    // Manat do Azerbaijão
    result.put("AZN", new CurrencyDataImpl("AZN", "man.", 2));
    // Dinar da Bósnia-Herzegovina
    result.put("BAD", new CurrencyDataImpl("BAD", "BAD", 130));
    // Marco bósnio-herzegovino conversível
    result.put("BAM", new CurrencyDataImpl("BAM", "KM", 2));
    // Dólar de Barbados
    result.put("BBD", new CurrencyDataImpl("BBD", "Bds$", 2));
    // Taka de Bangladesh
    result.put("BDT", new CurrencyDataImpl("BDT", "Tk", 2, "Tk"));
    // Franco belga (conversível)
    result.put("BEC", new CurrencyDataImpl("BEC", "BEC", 2));
    // Franco belga
    result.put("BEF", new CurrencyDataImpl("BEF", "BF", 130));
    // Franco belga (financeiro)
    result.put("BEL", new CurrencyDataImpl("BEL", "BEL", 2));
    // Lev forte búlgaro
    result.put("BGL", new CurrencyDataImpl("BGL", "BGL", 130));
    // Lev novo búlgaro
    result.put("BGN", new CurrencyDataImpl("BGN", "BGN", 2));
    // Dinar bareinita
    result.put("BHD", new CurrencyDataImpl("BHD", "BD", 3));
    // Franco do Burundi
    result.put("BIF", new CurrencyDataImpl("BIF", "FBu", 0));
    // Dólar das Bermudas
    result.put("BMD", new CurrencyDataImpl("BMD", "BD$", 2));
    // Dólar do Brunei
    result.put("BND", new CurrencyDataImpl("BND", "BN$", 2));
    // Boliviano
    result.put("BOB", new CurrencyDataImpl("BOB", "Bs", 2));
    // Peso boliviano
    result.put("BOP", new CurrencyDataImpl("BOP", "$b.", 130));
    // Mvdol boliviano
    result.put("BOV", new CurrencyDataImpl("BOV", "BOV", 2));
    // Cruzeiro novo brasileiro (1967-1986)
    result.put("BRB", new CurrencyDataImpl("BRB", "BRB", 130));
    // Cruzado brasileiro
    result.put("BRC", new CurrencyDataImpl("BRC", "BRC", 130));
    // Cruzeiro brasileiro (1990-1993)
    result.put("BRE", new CurrencyDataImpl("BRE", "BRE", 130));
    // Real brasileiro
    result.put("BRL", new CurrencyDataImpl("BRL", "R$", 2, "R$"));
    // Cruzado novo brasileiro
    result.put("BRN", new CurrencyDataImpl("BRN", "BRN", 130));
    // Cruzeiro brasileiro
    result.put("BRR", new CurrencyDataImpl("BRR", "BRR", 130));
    // Dólar das Bahamas
    result.put("BSD", new CurrencyDataImpl("BSD", "BS$", 2));
    // Ngultrum do Butão
    result.put("BTN", new CurrencyDataImpl("BTN", "Nu.", 2));
    // Kyat birmanês
    result.put("BUK", new CurrencyDataImpl("BUK", "BUK", 130));
    // Pula botsuanesa
    result.put("BWP", new CurrencyDataImpl("BWP", "BWP", 2));
    // Rublo novo bielo-russo (1994-1999)
    result.put("BYB", new CurrencyDataImpl("BYB", "BYB", 130));
    // Rublo bielo-russo
    result.put("BYR", new CurrencyDataImpl("BYR", "BYR", 0));
    // Dólar do Belize
    result.put("BZD", new CurrencyDataImpl("BZD", "BZ$", 2));
    // Dólar canadense
    result.put("CAD", new CurrencyDataImpl("CAD", "CA$", 2, "C$"));
    // Franco congolês
    result.put("CDF", new CurrencyDataImpl("CDF", "CDF", 2));
    // Euro WIR
    result.put("CHE", new CurrencyDataImpl("CHE", "CHE", 2));
    // Franco suíço
    result.put("CHF", new CurrencyDataImpl("CHF", "Fr.", 2, "CHF"));
    // Franco WIR
    result.put("CHW", new CurrencyDataImpl("CHW", "CHW", 2));
    // CLE
    result.put("CLE", new CurrencyDataImpl("CLE", "Eº", 130));
    // Unidades de Fomento chilenas
    result.put("CLF", new CurrencyDataImpl("CLF", "CLF", 0));
    // Peso chileno
    result.put("CLP", new CurrencyDataImpl("CLP", "CL$", 0, "CL$"));
    // Yuan Renminbi chinês
    result.put("CNY", new CurrencyDataImpl("CNY", "CN¥", 2, "RMB¥"));
    // Peso colombiano
    result.put("COP", new CurrencyDataImpl("COP", "CO$", 0, "COL$"));
    // Unidade de Valor Real
    result.put("COU", new CurrencyDataImpl("COU", "COU", 2));
    // Colon da Costa Rica
    result.put("CRC", new CurrencyDataImpl("CRC", "₡", 0, "CR₡"));
    // Dinar sérvio antigo
    result.put("CSD", new CurrencyDataImpl("CSD", "CSD", 130));
    // Coroa Forte checoslovaca
    result.put("CSK", new CurrencyDataImpl("CSK", "CSK", 130));
    // CUC
    result.put("CUC", new CurrencyDataImpl("CUC", "CUC$", 2));
    // Peso cubano
    result.put("CUP", new CurrencyDataImpl("CUP", "CU$", 2, "$MN"));
    // Escudo cabo-verdiano
    result.put("CVE", new CurrencyDataImpl("CVE", "CV$", 2));
    // Libra cipriota
    result.put("CYP", new CurrencyDataImpl("CYP", "CY£", 130));
    // Coroa checa
    result.put("CZK", new CurrencyDataImpl("CZK", "Kč", 2, "Kč"));
    // Ostmark da Alemanha Oriental
    result.put("DDM", new CurrencyDataImpl("DDM", "DDM", 130));
    // Marco alemão
    result.put("DEM", new CurrencyDataImpl("DEM", "DM", 130));
    // Franco do Djibuti
    result.put("DJF", new CurrencyDataImpl("DJF", "Fdj", 0));
    // Coroa dinamarquesa
    result.put("DKK", new CurrencyDataImpl("DKK", "Dkr", 2, "kr"));
    // Peso dominicano
    result.put("DOP", new CurrencyDataImpl("DOP", "RD$", 2, "RD$"));
    // Dinar argelino
    result.put("DZD", new CurrencyDataImpl("DZD", "DA", 2));
    // Sucre equatoriano
    result.put("ECS", new CurrencyDataImpl("ECS", "ECS", 130));
    // Unidade de Valor Constante (UVC) do Equador
    result.put("ECV", new CurrencyDataImpl("ECV", "ECV", 2));
    // Coroa estoniana
    result.put("EEK", new CurrencyDataImpl("EEK", "Ekr", 2));
    // Libra egípcia
    result.put("EGP", new CurrencyDataImpl("EGP", "EG£", 2, "LE"));
    // EQE
    result.put("EQE", new CurrencyDataImpl("EQE", "EQE", 130));
    // Nakfa da Eritreia
    result.put("ERN", new CurrencyDataImpl("ERN", "Nfk", 2));
    // Peseta espanhola (conta A)
    result.put("ESA", new CurrencyDataImpl("ESA", "ESA", 2));
    // Peseta espanhola (conta conversível)
    result.put("ESB", new CurrencyDataImpl("ESB", "ESB", 2));
    // Peseta espanhola
    result.put("ESP", new CurrencyDataImpl("ESP", "Pts", 128));
    // Birr etíope
    result.put("ETB", new CurrencyDataImpl("ETB", "Br", 2));
    // Euro
    result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€"));
    // Marca finlandesa
    result.put("FIM", new CurrencyDataImpl("FIM", "mk", 130));
    // Dólar de Fiji
    result.put("FJD", new CurrencyDataImpl("FJD", "FJ$", 2));
    // Libra das Malvinas
    result.put("FKP", new CurrencyDataImpl("FKP", "FK£", 2));
    // Franco francês
    result.put("FRF", new CurrencyDataImpl("FRF", "₣", 130));
    // Libra esterlina britânica
    result.put("GBP", new CurrencyDataImpl("GBP", "£", 2, "GB£"));
    // Cupom Lari georgiano
    result.put("GEK", new CurrencyDataImpl("GEK", "GEK", 130));
    // Lari georgiano
    result.put("GEL", new CurrencyDataImpl("GEL", "GEL", 2));
    // Cedi de Gana (1979-2007)
    result.put("GHC", new CurrencyDataImpl("GHC", "₵", 130));
    // Cedi ganês
    result.put("GHS", new CurrencyDataImpl("GHS", "GH₵", 2));
    // Libra de Gibraltar
    result.put("GIP", new CurrencyDataImpl("GIP", "GI£", 2));
    // Dalasi de Gâmbia
    result.put("GMD", new CurrencyDataImpl("GMD", "GMD", 2));
    // Franco de Guiné
    result.put("GNF", new CurrencyDataImpl("GNF", "FG", 0));
    // Syli da Guiné
    result.put("GNS", new CurrencyDataImpl("GNS", "GNS", 130));
    // Ekwele da Guiné Equatorial
    result.put("GQE", new CurrencyDataImpl("GQE", "GQE", 130));
    // Dracma grego
    result.put("GRD", new CurrencyDataImpl("GRD", "₯", 130));
    // Quetçal da Guatemala
    result.put("GTQ", new CurrencyDataImpl("GTQ", "GTQ", 2));
    // Escudo da Guiné Portuguesa
    result.put("GWE", new CurrencyDataImpl("GWE", "GWE", 130));
    // Peso da Guiné-Bissau
    result.put("GWP", new CurrencyDataImpl("GWP", "GWP", 2));
    // Dólar da Guiana
    result.put("GYD", new CurrencyDataImpl("GYD", "GY$", 0));
    // Dólar de Hong Kong
    result.put("HKD", new CurrencyDataImpl("HKD", "HK$", 2, "HK$"));
    // Lempira de Honduras
    result.put("HNL", new CurrencyDataImpl("HNL", "HNL", 2));
    // Dinar croata
    result.put("HRD", new CurrencyDataImpl("HRD", "HRD", 130));
    // Kuna croata
    result.put("HRK", new CurrencyDataImpl("HRK", "kn", 2));
    // Gurde do Haiti
    result.put("HTG", new CurrencyDataImpl("HTG", "HTG", 2));
    // Forinte húngaro
    result.put("HUF", new CurrencyDataImpl("HUF", "Ft", 0));
    // Rupia indonésia
    result.put("IDR", new CurrencyDataImpl("IDR", "Rp", 0));
    // Libra irlandesa
    result.put("IEP", new CurrencyDataImpl("IEP", "IR£", 130));
    // Libra israelita
    result.put("ILP", new CurrencyDataImpl("ILP", "I£", 130));
    // Sheqel antigo israelita
    result.put("ILR", new CurrencyDataImpl("ILR", "ILR", 130));
    // Sheqel Novo israelita
    result.put("ILS", new CurrencyDataImpl("ILS", "₪", 2, "IL₪"));
    // Rúpia indiana
    result.put("INR", new CurrencyDataImpl("INR", "Rs", 2, "Rs"));
    // Dinar iraquiano
    result.put("IQD", new CurrencyDataImpl("IQD", "IQD", 0));
    // Rial iraniano
    result.put("IRR", new CurrencyDataImpl("IRR", "IRR", 0));
    // Coroa antiga islandesa
    result.put("ISJ", new CurrencyDataImpl("ISJ", "ISJ", 130));
    // Coroa islandesa
    result.put("ISK", new CurrencyDataImpl("ISK", "Ikr", 0, "kr"));
    // Lira italiana
    result.put("ITL", new CurrencyDataImpl("ITL", "IT₤", 128));
    // Dólar jamaicano
    result.put("JMD", new CurrencyDataImpl("JMD", "J$", 2, "JA$"));
    // Dinar jordaniano
    result.put("JOD", new CurrencyDataImpl("JOD", "JD", 3));
    // Iene japonês
    result.put("JPY", new CurrencyDataImpl("JPY", "JP¥", 0, "JP¥"));
    // Xelim queniano
    result.put("KES", new CurrencyDataImpl("KES", "Ksh", 2));
    // Som quirguiz
    result.put("KGS", new CurrencyDataImpl("KGS", "KGS", 2));
    // Riel cambojano
    result.put("KHR", new CurrencyDataImpl("KHR", "KHR", 2));
    // Franco de Comores
    result.put("KMF", new CurrencyDataImpl("KMF", "CF", 0));
    // Won norte-coreano
    result.put("KPW", new CurrencyDataImpl("KPW", "KPW", 0));
    // Won sul-coreano
    result.put("KRW", new CurrencyDataImpl("KRW", "₩", 0, "KR₩"));
    // Dinar coveitiano
    result.put("KWD", new CurrencyDataImpl("KWD", "KD", 3));
    // Dólar das Ilhas Caiman
    result.put("KYD", new CurrencyDataImpl("KYD", "KY$", 2));
    // Tenge do Cazaquistão
    result.put("KZT", new CurrencyDataImpl("KZT", "KZT", 2));
    // Kip de Laos
    result.put("LAK", new CurrencyDataImpl("LAK", "₭", 0));
    // Libra libanesa
    result.put("LBP", new CurrencyDataImpl("LBP", "LB£", 0));
    // Rupia do Sri Lanka
    result.put("LKR", new CurrencyDataImpl("LKR", "SLRs", 2, "SLRs"));
    // Dólar liberiano
    result.put("LRD", new CurrencyDataImpl("LRD", "L$", 2));
    // Loti do Lesoto
    result.put("LSL", new CurrencyDataImpl("LSL", "LSL", 2));
    // LSM
    result.put("LSM", new CurrencyDataImpl("LSM", "LSM", 130));
    // Lita lituano
    result.put("LTL", new CurrencyDataImpl("LTL", "Lt", 2));
    // Talonas lituano
    result.put("LTT", new CurrencyDataImpl("LTT", "LTT", 130));
    // Franco conversível de Luxemburgo
    result.put("LUC", new CurrencyDataImpl("LUC", "LUC", 2));
    // Franco luxemburguês
    result.put("LUF", new CurrencyDataImpl("LUF", "LUF", 128));
    // Franco financeiro de Luxemburgo
    result.put("LUL", new CurrencyDataImpl("LUL", "LUL", 2));
    // Lats letão
    result.put("LVL", new CurrencyDataImpl("LVL", "Ls", 2));
    // Rublo letão
    result.put("LVR", new CurrencyDataImpl("LVR", "LVR", 130));
    // Dinar líbio
    result.put("LYD", new CurrencyDataImpl("LYD", "LD", 3));
    // Dirém marroquino
    result.put("MAD", new CurrencyDataImpl("MAD", "MAD", 2));
    // Franco marroquino
    result.put("MAF", new CurrencyDataImpl("MAF", "MAF", 130));
    // Leu moldávio
    result.put("MDL", new CurrencyDataImpl("MDL", "MDL", 2));
    // Ariary de Madagascar
    result.put("MGA", new CurrencyDataImpl("MGA", "MGA", 0));
    // Franco de Madagascar
    result.put("MGF", new CurrencyDataImpl("MGF", "MGF", 128));
    // Dinar macedônio
    result.put("MKD", new CurrencyDataImpl("MKD", "MKD", 2));
    // Franco de Mali
    result.put("MLF", new CurrencyDataImpl("MLF", "MLF", 130));
    // Kyat de Mianmar
    result.put("MMK", new CurrencyDataImpl("MMK", "MMK", 0));
    // Tugrik mongol
    result.put("MNT", new CurrencyDataImpl("MNT", "₮", 0, "MN₮"));
    // Pataca macaense
    result.put("MOP", new CurrencyDataImpl("MOP", "MOP$", 2));
    // Ouguiya da Mauritânia
    result.put("MRO", new CurrencyDataImpl("MRO", "UM", 0));
    // Lira maltesa
    result.put("MTL", new CurrencyDataImpl("MTL", "Lm", 130));
    // Libra maltesa
    result.put("MTP", new CurrencyDataImpl("MTP", "MT£", 130));
    // Rupia de Maurício
    result.put("MUR", new CurrencyDataImpl("MUR", "MURs", 0));
    // Rupias das Ilhas Maldivas
    result.put("MVR", new CurrencyDataImpl("MVR", "MVR", 2));
    // Cuacha do Maláui
    result.put("MWK", new CurrencyDataImpl("MWK", "MWK", 2));
    // Peso mexicano
    result.put("MXN", new CurrencyDataImpl("MXN", "Mex$", 2, "Mex$"));
    // Peso Prata mexicano (1861-1992)
    result.put("MXP", new CurrencyDataImpl("MXP", "MX$", 130));
    // Unidade Mexicana de Investimento (UDI)
    result.put("MXV", new CurrencyDataImpl("MXV", "MXV", 2));
    // Ringgit malaio
    result.put("MYR", new CurrencyDataImpl("MYR", "RM", 2, "RM"));
    // Escudo de Moçambique
    result.put("MZE", new CurrencyDataImpl("MZE", "MZE", 130));
    // Metical antigo de Moçambique
    result.put("MZM", new CurrencyDataImpl("MZM", "Mt", 130));
    // Metical do Moçambique
    result.put("MZN", new CurrencyDataImpl("MZN", "MTn", 2));
    // Dólar da Namíbia
    result.put("NAD", new CurrencyDataImpl("NAD", "N$", 2));
    // Naira nigeriana
    result.put("NGN", new CurrencyDataImpl("NGN", "₦", 2));
    // Córdoba nicaraguense
    result.put("NIC", new CurrencyDataImpl("NIC", "NIC", 130));
    // Córdoba Ouro nicaraguense
    result.put("NIO", new CurrencyDataImpl("NIO", "C$", 2));
    // Florim holandês
    result.put("NLG", new CurrencyDataImpl("NLG", "fl", 130));
    // Coroa norueguesa
    result.put("NOK", new CurrencyDataImpl("NOK", "Nkr", 2, "NOkr"));
    // Rupia nepalesa
    result.put("NPR", new CurrencyDataImpl("NPR", "NPRs", 2));
    // Dólar da Nova Zelândia
    result.put("NZD", new CurrencyDataImpl("NZD", "NZ$", 2));
    // Rial de Omã
    result.put("OMR", new CurrencyDataImpl("OMR", "OMR", 3));
    // Balboa panamenho
    result.put("PAB", new CurrencyDataImpl("PAB", "B/.", 2, "B/."));
    // Inti peruano
    result.put("PEI", new CurrencyDataImpl("PEI", "I/.", 130));
    // Sol Novo peruano
    result.put("PEN", new CurrencyDataImpl("PEN", "S/.", 2, "S/."));
    // Sol peruano
    result.put("PES", new CurrencyDataImpl("PES", "PES", 130));
    // Kina da Papua-Nova Guiné
    result.put("PGK", new CurrencyDataImpl("PGK", "PGK", 2));
    // Peso filipino
    result.put("PHP", new CurrencyDataImpl("PHP", "₱", 2, "PHP"));
    // Rupia paquistanesa
    result.put("PKR", new CurrencyDataImpl("PKR", "PKRs", 0, "PKRs."));
    // Zloti polonês
    result.put("PLN", new CurrencyDataImpl("PLN", "zł", 2));
    // Zloti polonês (1950-1995)
    result.put("PLZ", new CurrencyDataImpl("PLZ", "PLZ", 130));
    // Escudo português
    result.put("PTE", new CurrencyDataImpl("PTE", "Esc.", 130));
    // Guarani paraguaio
    result.put("PYG", new CurrencyDataImpl("PYG", "₲", 0));
    // Rial catariano
    result.put("QAR", new CurrencyDataImpl("QAR", "QR", 2));
    // Dólar rodesiano
    result.put("RHD", new CurrencyDataImpl("RHD", "RH$", 130));
    // Leu romeno antigo
    result.put("ROL", new CurrencyDataImpl("ROL", "ROL", 130));
    // Leu romeno
    result.put("RON", new CurrencyDataImpl("RON", "RON", 2));
    // Dinar sérvio
    result.put("RSD", new CurrencyDataImpl("RSD", "din.", 0));
    // Rublo russo
    result.put("RUB", new CurrencyDataImpl("RUB", "руб", 2, "руб"));
    // Rublo russo (1991-1998)
    result.put("RUR", new CurrencyDataImpl("RUR", "RUR", 130));
    // Franco ruandês
    result.put("RWF", new CurrencyDataImpl("RWF", "RWF", 0));
    // Rial saudita
    result.put("SAR", new CurrencyDataImpl("SAR", "SR", 2, "SR"));
    // Dólar das Ilhas Salomão
    result.put("SBD", new CurrencyDataImpl("SBD", "SI$", 2));
    // Rupia das Seychelles
    result.put("SCR", new CurrencyDataImpl("SCR", "SRe", 2));
    // Dinar sudanês
    result.put("SDD", new CurrencyDataImpl("SDD", "LSd", 130));
    // Libra sudanesa
    result.put("SDG", new CurrencyDataImpl("SDG", "SDG", 2));
    // Libra sudanesa antiga
    result.put("SDP", new CurrencyDataImpl("SDP", "SDP", 130));
    // Coroa sueca
    result.put("SEK", new CurrencyDataImpl("SEK", "Skr", 2, "kr"));
    // Dólar de Cingapura
    result.put("SGD", new CurrencyDataImpl("SGD", "S$", 2, "S$"));
    // Libra de Santa Helena
    result.put("SHP", new CurrencyDataImpl("SHP", "SH£", 2));
    // Tolar Bons esloveno
    result.put("SIT", new CurrencyDataImpl("SIT", "SIT", 130));
    // Coroa eslovaca
    result.put("SKK", new CurrencyDataImpl("SKK", "Sk", 130));
    // Leone de Serra Leoa
    result.put("SLL", new CurrencyDataImpl("SLL", "Le", 0));
    // Xelim somali
    result.put("SOS", new CurrencyDataImpl("SOS", "Ssh", 0));
    // Dólar do Suriname
    result.put("SRD", new CurrencyDataImpl("SRD", "SR$", 2));
    // Florim do Suriname
    result.put("SRG", new CurrencyDataImpl("SRG", "Sf", 130));
    // Dobra de São Tomé e Príncipe
    result.put("STD", new CurrencyDataImpl("STD", "Db", 0));
    // Rublo soviético
    result.put("SUR", new CurrencyDataImpl("SUR", "SUR", 130));
    // Colom salvadorenho
    result.put("SVC", new CurrencyDataImpl("SVC", "SV₡", 130));
    // Libra síria
    result.put("SYP", new CurrencyDataImpl("SYP", "SY£", 0));
    // Lilangeni da Suazilândia
    result.put("SZL", new CurrencyDataImpl("SZL", "SZL", 2));
    // Baht tailandês
    result.put("THB", new CurrencyDataImpl("THB", "฿", 2, "THB"));
    // Rublo do Tadjiquistão
    result.put("TJR", new CurrencyDataImpl("TJR", "TJR", 130));
    // Somoni tadjique
    result.put("TJS", new CurrencyDataImpl("TJS", "TJS", 2));
    // Manat do Turcomenistão
    result.put("TMM", new CurrencyDataImpl("TMM", "TMM", 128));
    // Dinar tunisiano
    result.put("TND", new CurrencyDataImpl("TND", "DT", 3));
    // Paʻanga de Tonga
    result.put("TOP", new CurrencyDataImpl("TOP", "T$", 2));
    // Escudo timorense
    result.put("TPE", new CurrencyDataImpl("TPE", "TPE", 130));
    // Lira turca antiga
    result.put("TRL", new CurrencyDataImpl("TRL", "TRL", 128));
    // Lira turca
    result.put("TRY", new CurrencyDataImpl("TRY", "TL", 2, "YTL"));
    // Dólar de Trinidad e Tobago
    result.put("TTD", new CurrencyDataImpl("TTD", "TT$", 2));
    // Dólar Novo de Taiwan
    result.put("TWD", new CurrencyDataImpl("TWD", "NT$", 2, "NT$"));
    // Xelim da Tanzânia
    result.put("TZS", new CurrencyDataImpl("TZS", "TSh", 0));
    // Hryvnia ucraniano
    result.put("UAH", new CurrencyDataImpl("UAH", "₴", 2));
    // Karbovanetz ucraniano
    result.put("UAK", new CurrencyDataImpl("UAK", "UAK", 130));
    // Xelim ugandense (1966-1987)
    result.put("UGS", new CurrencyDataImpl("UGS", "UGS", 130));
    // Xelim ugandense
    result.put("UGX", new CurrencyDataImpl("UGX", "USh", 0));
    // Dólar norte-americano
    result.put("USD", new CurrencyDataImpl("USD", "US$", 2, "US$"));
    // Dólar norte-americano (Dia seguinte)
    result.put("USN", new CurrencyDataImpl("USN", "USN", 2));
    // Dólar norte-americano (Mesmo dia)
    result.put("USS", new CurrencyDataImpl("USS", "USS", 2));
    // Peso uruguaio en unidades indexadas
    result.put("UYI", new CurrencyDataImpl("UYI", "UYI", 2));
    // Peso uruguaio (1975-1993)
    result.put("UYP", new CurrencyDataImpl("UYP", "UYP", 130));
    // Peso uruguaio
    result.put("UYU", new CurrencyDataImpl("UYU", "$U", 2, "UY$"));
    // Sum do Usbequistão
    result.put("UZS", new CurrencyDataImpl("UZS", "UZS", 0));
    // Bolívar venezuelano
    result.put("VEB", new CurrencyDataImpl("VEB", "VEB", 130));
    // Bolívar v enezuelano forte
    result.put("VEF", new CurrencyDataImpl("VEF", "Bs.F.", 2));
    // Dong vietnamita
    result.put("VND", new CurrencyDataImpl("VND", "₫", 24, "₫"));
    // Vatu de Vanuatu
    result.put("VUV", new CurrencyDataImpl("VUV", "VT", 0));
    // Tala samoano
    result.put("WST", new CurrencyDataImpl("WST", "WS$", 2));
    // Franco CFA BEAC
    result.put("XAF", new CurrencyDataImpl("XAF", "FCFA", 0));
    // Prata
    result.put("XAG", new CurrencyDataImpl("XAG", "XAG", 2));
    // Ouro
    result.put("XAU", new CurrencyDataImpl("XAU", "XAU", 2));
    // Unidade Composta Europeia
    result.put("XBA", new CurrencyDataImpl("XBA", "XBA", 2));
    // Unidade Monetária Europeia
    result.put("XBB", new CurrencyDataImpl("XBB", "XBB", 2));
    // Unidade de Conta Europeia (XBC)
    result.put("XBC", new CurrencyDataImpl("XBC", "XBC", 2));
    // Unidade de Conta Europeia (XBD)
    result.put("XBD", new CurrencyDataImpl("XBD", "XBD", 2));
    // Dólar do Caribe Oriental
    result.put("XCD", new CurrencyDataImpl("XCD", "EC$", 2));
    // Direitos Especiais de Giro
    result.put("XDR", new CurrencyDataImpl("XDR", "XDR", 2));
    // Unidade de Moeda Europeia
    result.put("XEU", new CurrencyDataImpl("XEU", "XEU", 2));
    // Franco-ouro francês
    result.put("XFO", new CurrencyDataImpl("XFO", "XFO", 2));
    // Franco UIC francês
    result.put("XFU", new CurrencyDataImpl("XFU", "XFU", 2));
    // Franco CFA BCEAO
    result.put("XOF", new CurrencyDataImpl("XOF", "CFA", 0));
    // Paládio
    result.put("XPD", new CurrencyDataImpl("XPD", "XPD", 2));
    // Franco CFP
    result.put("XPF", new CurrencyDataImpl("XPF", "CFPF", 0));
    // Platina
    result.put("XPT", new CurrencyDataImpl("XPT", "XPT", 2));
    // Fundos RINET
    result.put("XRE", new CurrencyDataImpl("XRE", "XRE", 2));
    // Código de Moeda de Teste
    result.put("XTS", new CurrencyDataImpl("XTS", "XTS", 2));
    // Moeda Desconhecida ou Inválida
    result.put("XXX", new CurrencyDataImpl("XXX", "XXX", 2));
    // Dinar iemenita
    result.put("YDD", new CurrencyDataImpl("YDD", "YDD", 130));
    // Rial iemenita
    result.put("YER", new CurrencyDataImpl("YER", "YR", 0, "YER"));
    // Dinar forte iugoslavo
    result.put("YUD", new CurrencyDataImpl("YUD", "YUD", 130));
    // Dinar noviy iugoslavo
    result.put("YUM", new CurrencyDataImpl("YUM", "YUM", 130));
    // Dinar conversível iugoslavo
    result.put("YUN", new CurrencyDataImpl("YUN", "YUN", 130));
    // Rand sul-africano (financeiro)
    result.put("ZAL", new CurrencyDataImpl("ZAL", "ZAL", 2));
    // Rand sul-africano
    result.put("ZAR", new CurrencyDataImpl("ZAR", "R", 2, "ZAR"));
    // Cuacha zambiano
    result.put("ZMK", new CurrencyDataImpl("ZMK", "ZK", 0));
    // Zaire Novo zairense
    result.put("ZRN", new CurrencyDataImpl("ZRN", "NZ", 130));
    // Zaire zairense
    result.put("ZRZ", new CurrencyDataImpl("ZRZ", "ZRZ", 130));
    // Dólar do Zimbábue
    result.put("ZWD", new CurrencyDataImpl("ZWD", "Z$", 128));
    return result;
  }
  
  @Override
  protected JavaScriptObject loadCurrencyMapNative() {
    return overrideMap(super.loadCurrencyMapNative(), loadMyCurrencyMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyCurrencyMapOverridesNative() /*-{
    return {
      // Peseta de Andorra
      "ADP": [ "ADP", "ADP", 128],
      // Dirém dos Emirados Árabes Unidos
      "AED": [ "AED", "DH", 2, "DH"],
      // Afegane (1927-2002)
      "AFA": [ "AFA", "AFA", 130],
      // Afegane
      "AFN": [ "AFN", "Af", 0],
      // Lek Albanês
      "ALL": [ "ALL", "ALL", 0],
      // Dram armênio
      "AMD": [ "AMD", "AMD", 0],
      // Guilder das Antilhas Holandesas
      "ANG": [ "ANG", "NAf.", 2],
      // Cuanza angolano
      "AOA": [ "AOA", "Kz", 2],
      // Cuanza angolano (1977-1990)
      "AOK": [ "AOK", "AOK", 130],
      // Novo cuanza angolano (1990-2000)
      "AON": [ "AON", "AON", 130],
      // Cuanza angolano reajustado (1995-1999)
      "AOR": [ "AOR", "AOR", 130],
      // Austral argentino
      "ARA": [ "ARA", "₳", 130],
      // ARL
      "ARL": [ "ARL", "$L", 130],
      // ARM
      "ARM": [ "ARM", "m$n", 130],
      // Peso argentino (1983-1985)
      "ARP": [ "ARP", "ARP", 130],
      // Peso argentino
      "ARS": [ "ARS", "AR$", 2, "AR$"],
      // Xelim austríaco
      "ATS": [ "ATS", "ATS", 130],
      // Dólar australiano
      "AUD": [ "AUD", "AU$", 2, "AU$"],
      // Guilder de Aruba
      "AWG": [ "AWG", "Afl.", 2],
      // Manat azerbaijano
      "AZM": [ "AZM", "AZM", 130],
      // Manat do Azerbaijão
      "AZN": [ "AZN", "man.", 2],
      // Dinar da Bósnia-Herzegovina
      "BAD": [ "BAD", "BAD", 130],
      // Marco bósnio-herzegovino conversível
      "BAM": [ "BAM", "KM", 2],
      // Dólar de Barbados
      "BBD": [ "BBD", "Bds$", 2],
      // Taka de Bangladesh
      "BDT": [ "BDT", "Tk", 2, "Tk"],
      // Franco belga (conversível)
      "BEC": [ "BEC", "BEC", 2],
      // Franco belga
      "BEF": [ "BEF", "BF", 130],
      // Franco belga (financeiro)
      "BEL": [ "BEL", "BEL", 2],
      // Lev forte búlgaro
      "BGL": [ "BGL", "BGL", 130],
      // Lev novo búlgaro
      "BGN": [ "BGN", "BGN", 2],
      // Dinar bareinita
      "BHD": [ "BHD", "BD", 3],
      // Franco do Burundi
      "BIF": [ "BIF", "FBu", 0],
      // Dólar das Bermudas
      "BMD": [ "BMD", "BD$", 2],
      // Dólar do Brunei
      "BND": [ "BND", "BN$", 2],
      // Boliviano
      "BOB": [ "BOB", "Bs", 2],
      // Peso boliviano
      "BOP": [ "BOP", "$b.", 130],
      // Mvdol boliviano
      "BOV": [ "BOV", "BOV", 2],
      // Cruzeiro novo brasileiro (1967-1986)
      "BRB": [ "BRB", "BRB", 130],
      // Cruzado brasileiro
      "BRC": [ "BRC", "BRC", 130],
      // Cruzeiro brasileiro (1990-1993)
      "BRE": [ "BRE", "BRE", 130],
      // Real brasileiro
      "BRL": [ "BRL", "R$", 2, "R$"],
      // Cruzado novo brasileiro
      "BRN": [ "BRN", "BRN", 130],
      // Cruzeiro brasileiro
      "BRR": [ "BRR", "BRR", 130],
      // Dólar das Bahamas
      "BSD": [ "BSD", "BS$", 2],
      // Ngultrum do Butão
      "BTN": [ "BTN", "Nu.", 2],
      // Kyat birmanês
      "BUK": [ "BUK", "BUK", 130],
      // Pula botsuanesa
      "BWP": [ "BWP", "BWP", 2],
      // Rublo novo bielo-russo (1994-1999)
      "BYB": [ "BYB", "BYB", 130],
      // Rublo bielo-russo
      "BYR": [ "BYR", "BYR", 0],
      // Dólar do Belize
      "BZD": [ "BZD", "BZ$", 2],
      // Dólar canadense
      "CAD": [ "CAD", "CA$", 2, "C$"],
      // Franco congolês
      "CDF": [ "CDF", "CDF", 2],
      // Euro WIR
      "CHE": [ "CHE", "CHE", 2],
      // Franco suíço
      "CHF": [ "CHF", "Fr.", 2, "CHF"],
      // Franco WIR
      "CHW": [ "CHW", "CHW", 2],
      // CLE
      "CLE": [ "CLE", "Eº", 130],
      // Unidades de Fomento chilenas
      "CLF": [ "CLF", "CLF", 0],
      // Peso chileno
      "CLP": [ "CLP", "CL$", 0, "CL$"],
      // Yuan Renminbi chinês
      "CNY": [ "CNY", "CN¥", 2, "RMB¥"],
      // Peso colombiano
      "COP": [ "COP", "CO$", 0, "COL$"],
      // Unidade de Valor Real
      "COU": [ "COU", "COU", 2],
      // Colon da Costa Rica
      "CRC": [ "CRC", "₡", 0, "CR₡"],
      // Dinar sérvio antigo
      "CSD": [ "CSD", "CSD", 130],
      // Coroa Forte checoslovaca
      "CSK": [ "CSK", "CSK", 130],
      // CUC
      "CUC": [ "CUC", "CUC$", 2],
      // Peso cubano
      "CUP": [ "CUP", "CU$", 2, "$MN"],
      // Escudo cabo-verdiano
      "CVE": [ "CVE", "CV$", 2],
      // Libra cipriota
      "CYP": [ "CYP", "CY£", 130],
      // Coroa checa
      "CZK": [ "CZK", "Kč", 2, "Kč"],
      // Ostmark da Alemanha Oriental
      "DDM": [ "DDM", "DDM", 130],
      // Marco alemão
      "DEM": [ "DEM", "DM", 130],
      // Franco do Djibuti
      "DJF": [ "DJF", "Fdj", 0],
      // Coroa dinamarquesa
      "DKK": [ "DKK", "Dkr", 2, "kr"],
      // Peso dominicano
      "DOP": [ "DOP", "RD$", 2, "RD$"],
      // Dinar argelino
      "DZD": [ "DZD", "DA", 2],
      // Sucre equatoriano
      "ECS": [ "ECS", "ECS", 130],
      // Unidade de Valor Constante (UVC) do Equador
      "ECV": [ "ECV", "ECV", 2],
      // Coroa estoniana
      "EEK": [ "EEK", "Ekr", 2],
      // Libra egípcia
      "EGP": [ "EGP", "EG£", 2, "LE"],
      // EQE
      "EQE": [ "EQE", "EQE", 130],
      // Nakfa da Eritreia
      "ERN": [ "ERN", "Nfk", 2],
      // Peseta espanhola (conta A)
      "ESA": [ "ESA", "ESA", 2],
      // Peseta espanhola (conta conversível)
      "ESB": [ "ESB", "ESB", 2],
      // Peseta espanhola
      "ESP": [ "ESP", "Pts", 128],
      // Birr etíope
      "ETB": [ "ETB", "Br", 2],
      // Euro
      "EUR": [ "EUR", "€", 2, "€"],
      // Marca finlandesa
      "FIM": [ "FIM", "mk", 130],
      // Dólar de Fiji
      "FJD": [ "FJD", "FJ$", 2],
      // Libra das Malvinas
      "FKP": [ "FKP", "FK£", 2],
      // Franco francês
      "FRF": [ "FRF", "₣", 130],
      // Libra esterlina britânica
      "GBP": [ "GBP", "£", 2, "GB£"],
      // Cupom Lari georgiano
      "GEK": [ "GEK", "GEK", 130],
      // Lari georgiano
      "GEL": [ "GEL", "GEL", 2],
      // Cedi de Gana (1979-2007)
      "GHC": [ "GHC", "₵", 130],
      // Cedi ganês
      "GHS": [ "GHS", "GH₵", 2],
      // Libra de Gibraltar
      "GIP": [ "GIP", "GI£", 2],
      // Dalasi de Gâmbia
      "GMD": [ "GMD", "GMD", 2],
      // Franco de Guiné
      "GNF": [ "GNF", "FG", 0],
      // Syli da Guiné
      "GNS": [ "GNS", "GNS", 130],
      // Ekwele da Guiné Equatorial
      "GQE": [ "GQE", "GQE", 130],
      // Dracma grego
      "GRD": [ "GRD", "₯", 130],
      // Quetçal da Guatemala
      "GTQ": [ "GTQ", "GTQ", 2],
      // Escudo da Guiné Portuguesa
      "GWE": [ "GWE", "GWE", 130],
      // Peso da Guiné-Bissau
      "GWP": [ "GWP", "GWP", 2],
      // Dólar da Guiana
      "GYD": [ "GYD", "GY$", 0],
      // Dólar de Hong Kong
      "HKD": [ "HKD", "HK$", 2, "HK$"],
      // Lempira de Honduras
      "HNL": [ "HNL", "HNL", 2],
      // Dinar croata
      "HRD": [ "HRD", "HRD", 130],
      // Kuna croata
      "HRK": [ "HRK", "kn", 2],
      // Gurde do Haiti
      "HTG": [ "HTG", "HTG", 2],
      // Forinte húngaro
      "HUF": [ "HUF", "Ft", 0],
      // Rupia indonésia
      "IDR": [ "IDR", "Rp", 0],
      // Libra irlandesa
      "IEP": [ "IEP", "IR£", 130],
      // Libra israelita
      "ILP": [ "ILP", "I£", 130],
      // Sheqel antigo israelita
      "ILR": [ "ILR", "ILR", 130],
      // Sheqel Novo israelita
      "ILS": [ "ILS", "₪", 2, "IL₪"],
      // Rúpia indiana
      "INR": [ "INR", "Rs", 2, "Rs"],
      // Dinar iraquiano
      "IQD": [ "IQD", "IQD", 0],
      // Rial iraniano
      "IRR": [ "IRR", "IRR", 0],
      // Coroa antiga islandesa
      "ISJ": [ "ISJ", "ISJ", 130],
      // Coroa islandesa
      "ISK": [ "ISK", "Ikr", 0, "kr"],
      // Lira italiana
      "ITL": [ "ITL", "IT₤", 128],
      // Dólar jamaicano
      "JMD": [ "JMD", "J$", 2, "JA$"],
      // Dinar jordaniano
      "JOD": [ "JOD", "JD", 3],
      // Iene japonês
      "JPY": [ "JPY", "JP¥", 0, "JP¥"],
      // Xelim queniano
      "KES": [ "KES", "Ksh", 2],
      // Som quirguiz
      "KGS": [ "KGS", "KGS", 2],
      // Riel cambojano
      "KHR": [ "KHR", "KHR", 2],
      // Franco de Comores
      "KMF": [ "KMF", "CF", 0],
      // Won norte-coreano
      "KPW": [ "KPW", "KPW", 0],
      // Won sul-coreano
      "KRW": [ "KRW", "₩", 0, "KR₩"],
      // Dinar coveitiano
      "KWD": [ "KWD", "KD", 3],
      // Dólar das Ilhas Caiman
      "KYD": [ "KYD", "KY$", 2],
      // Tenge do Cazaquistão
      "KZT": [ "KZT", "KZT", 2],
      // Kip de Laos
      "LAK": [ "LAK", "₭", 0],
      // Libra libanesa
      "LBP": [ "LBP", "LB£", 0],
      // Rupia do Sri Lanka
      "LKR": [ "LKR", "SLRs", 2, "SLRs"],
      // Dólar liberiano
      "LRD": [ "LRD", "L$", 2],
      // Loti do Lesoto
      "LSL": [ "LSL", "LSL", 2],
      // LSM
      "LSM": [ "LSM", "LSM", 130],
      // Lita lituano
      "LTL": [ "LTL", "Lt", 2],
      // Talonas lituano
      "LTT": [ "LTT", "LTT", 130],
      // Franco conversível de Luxemburgo
      "LUC": [ "LUC", "LUC", 2],
      // Franco luxemburguês
      "LUF": [ "LUF", "LUF", 128],
      // Franco financeiro de Luxemburgo
      "LUL": [ "LUL", "LUL", 2],
      // Lats letão
      "LVL": [ "LVL", "Ls", 2],
      // Rublo letão
      "LVR": [ "LVR", "LVR", 130],
      // Dinar líbio
      "LYD": [ "LYD", "LD", 3],
      // Dirém marroquino
      "MAD": [ "MAD", "MAD", 2],
      // Franco marroquino
      "MAF": [ "MAF", "MAF", 130],
      // Leu moldávio
      "MDL": [ "MDL", "MDL", 2],
      // Ariary de Madagascar
      "MGA": [ "MGA", "MGA", 0],
      // Franco de Madagascar
      "MGF": [ "MGF", "MGF", 128],
      // Dinar macedônio
      "MKD": [ "MKD", "MKD", 2],
      // Franco de Mali
      "MLF": [ "MLF", "MLF", 130],
      // Kyat de Mianmar
      "MMK": [ "MMK", "MMK", 0],
      // Tugrik mongol
      "MNT": [ "MNT", "₮", 0, "MN₮"],
      // Pataca macaense
      "MOP": [ "MOP", "MOP$", 2],
      // Ouguiya da Mauritânia
      "MRO": [ "MRO", "UM", 0],
      // Lira maltesa
      "MTL": [ "MTL", "Lm", 130],
      // Libra maltesa
      "MTP": [ "MTP", "MT£", 130],
      // Rupia de Maurício
      "MUR": [ "MUR", "MURs", 0],
      // Rupias das Ilhas Maldivas
      "MVR": [ "MVR", "MVR", 2],
      // Cuacha do Maláui
      "MWK": [ "MWK", "MWK", 2],
      // Peso mexicano
      "MXN": [ "MXN", "Mex$", 2, "Mex$"],
      // Peso Prata mexicano (1861-1992)
      "MXP": [ "MXP", "MX$", 130],
      // Unidade Mexicana de Investimento (UDI)
      "MXV": [ "MXV", "MXV", 2],
      // Ringgit malaio
      "MYR": [ "MYR", "RM", 2, "RM"],
      // Escudo de Moçambique
      "MZE": [ "MZE", "MZE", 130],
      // Metical antigo de Moçambique
      "MZM": [ "MZM", "Mt", 130],
      // Metical do Moçambique
      "MZN": [ "MZN", "MTn", 2],
      // Dólar da Namíbia
      "NAD": [ "NAD", "N$", 2],
      // Naira nigeriana
      "NGN": [ "NGN", "₦", 2],
      // Córdoba nicaraguense
      "NIC": [ "NIC", "NIC", 130],
      // Córdoba Ouro nicaraguense
      "NIO": [ "NIO", "C$", 2],
      // Florim holandês
      "NLG": [ "NLG", "fl", 130],
      // Coroa norueguesa
      "NOK": [ "NOK", "Nkr", 2, "NOkr"],
      // Rupia nepalesa
      "NPR": [ "NPR", "NPRs", 2],
      // Dólar da Nova Zelândia
      "NZD": [ "NZD", "NZ$", 2],
      // Rial de Omã
      "OMR": [ "OMR", "OMR", 3],
      // Balboa panamenho
      "PAB": [ "PAB", "B/.", 2, "B/."],
      // Inti peruano
      "PEI": [ "PEI", "I/.", 130],
      // Sol Novo peruano
      "PEN": [ "PEN", "S/.", 2, "S/."],
      // Sol peruano
      "PES": [ "PES", "PES", 130],
      // Kina da Papua-Nova Guiné
      "PGK": [ "PGK", "PGK", 2],
      // Peso filipino
      "PHP": [ "PHP", "₱", 2, "PHP"],
      // Rupia paquistanesa
      "PKR": [ "PKR", "PKRs", 0, "PKRs."],
      // Zloti polonês
      "PLN": [ "PLN", "zł", 2],
      // Zloti polonês (1950-1995)
      "PLZ": [ "PLZ", "PLZ", 130],
      // Escudo português
      "PTE": [ "PTE", "Esc.", 130],
      // Guarani paraguaio
      "PYG": [ "PYG", "₲", 0],
      // Rial catariano
      "QAR": [ "QAR", "QR", 2],
      // Dólar rodesiano
      "RHD": [ "RHD", "RH$", 130],
      // Leu romeno antigo
      "ROL": [ "ROL", "ROL", 130],
      // Leu romeno
      "RON": [ "RON", "RON", 2],
      // Dinar sérvio
      "RSD": [ "RSD", "din.", 0],
      // Rublo russo
      "RUB": [ "RUB", "руб", 2, "руб"],
      // Rublo russo (1991-1998)
      "RUR": [ "RUR", "RUR", 130],
      // Franco ruandês
      "RWF": [ "RWF", "RWF", 0],
      // Rial saudita
      "SAR": [ "SAR", "SR", 2, "SR"],
      // Dólar das Ilhas Salomão
      "SBD": [ "SBD", "SI$", 2],
      // Rupia das Seychelles
      "SCR": [ "SCR", "SRe", 2],
      // Dinar sudanês
      "SDD": [ "SDD", "LSd", 130],
      // Libra sudanesa
      "SDG": [ "SDG", "SDG", 2],
      // Libra sudanesa antiga
      "SDP": [ "SDP", "SDP", 130],
      // Coroa sueca
      "SEK": [ "SEK", "Skr", 2, "kr"],
      // Dólar de Cingapura
      "SGD": [ "SGD", "S$", 2, "S$"],
      // Libra de Santa Helena
      "SHP": [ "SHP", "SH£", 2],
      // Tolar Bons esloveno
      "SIT": [ "SIT", "SIT", 130],
      // Coroa eslovaca
      "SKK": [ "SKK", "Sk", 130],
      // Leone de Serra Leoa
      "SLL": [ "SLL", "Le", 0],
      // Xelim somali
      "SOS": [ "SOS", "Ssh", 0],
      // Dólar do Suriname
      "SRD": [ "SRD", "SR$", 2],
      // Florim do Suriname
      "SRG": [ "SRG", "Sf", 130],
      // Dobra de São Tomé e Príncipe
      "STD": [ "STD", "Db", 0],
      // Rublo soviético
      "SUR": [ "SUR", "SUR", 130],
      // Colom salvadorenho
      "SVC": [ "SVC", "SV₡", 130],
      // Libra síria
      "SYP": [ "SYP", "SY£", 0],
      // Lilangeni da Suazilândia
      "SZL": [ "SZL", "SZL", 2],
      // Baht tailandês
      "THB": [ "THB", "฿", 2, "THB"],
      // Rublo do Tadjiquistão
      "TJR": [ "TJR", "TJR", 130],
      // Somoni tadjique
      "TJS": [ "TJS", "TJS", 2],
      // Manat do Turcomenistão
      "TMM": [ "TMM", "TMM", 128],
      // Dinar tunisiano
      "TND": [ "TND", "DT", 3],
      // Paʻanga de Tonga
      "TOP": [ "TOP", "T$", 2],
      // Escudo timorense
      "TPE": [ "TPE", "TPE", 130],
      // Lira turca antiga
      "TRL": [ "TRL", "TRL", 128],
      // Lira turca
      "TRY": [ "TRY", "TL", 2, "YTL"],
      // Dólar de Trinidad e Tobago
      "TTD": [ "TTD", "TT$", 2],
      // Dólar Novo de Taiwan
      "TWD": [ "TWD", "NT$", 2, "NT$"],
      // Xelim da Tanzânia
      "TZS": [ "TZS", "TSh", 0],
      // Hryvnia ucraniano
      "UAH": [ "UAH", "₴", 2],
      // Karbovanetz ucraniano
      "UAK": [ "UAK", "UAK", 130],
      // Xelim ugandense (1966-1987)
      "UGS": [ "UGS", "UGS", 130],
      // Xelim ugandense
      "UGX": [ "UGX", "USh", 0],
      // Dólar norte-americano
      "USD": [ "USD", "US$", 2, "US$"],
      // Dólar norte-americano (Dia seguinte)
      "USN": [ "USN", "USN", 2],
      // Dólar norte-americano (Mesmo dia)
      "USS": [ "USS", "USS", 2],
      // Peso uruguaio en unidades indexadas
      "UYI": [ "UYI", "UYI", 2],
      // Peso uruguaio (1975-1993)
      "UYP": [ "UYP", "UYP", 130],
      // Peso uruguaio
      "UYU": [ "UYU", "$U", 2, "UY$"],
      // Sum do Usbequistão
      "UZS": [ "UZS", "UZS", 0],
      // Bolívar venezuelano
      "VEB": [ "VEB", "VEB", 130],
      // Bolívar v enezuelano forte
      "VEF": [ "VEF", "Bs.F.", 2],
      // Dong vietnamita
      "VND": [ "VND", "₫", 24, "₫"],
      // Vatu de Vanuatu
      "VUV": [ "VUV", "VT", 0],
      // Tala samoano
      "WST": [ "WST", "WS$", 2],
      // Franco CFA BEAC
      "XAF": [ "XAF", "FCFA", 0],
      // Prata
      "XAG": [ "XAG", "XAG", 2],
      // Ouro
      "XAU": [ "XAU", "XAU", 2],
      // Unidade Composta Europeia
      "XBA": [ "XBA", "XBA", 2],
      // Unidade Monetária Europeia
      "XBB": [ "XBB", "XBB", 2],
      // Unidade de Conta Europeia (XBC)
      "XBC": [ "XBC", "XBC", 2],
      // Unidade de Conta Europeia (XBD)
      "XBD": [ "XBD", "XBD", 2],
      // Dólar do Caribe Oriental
      "XCD": [ "XCD", "EC$", 2],
      // Direitos Especiais de Giro
      "XDR": [ "XDR", "XDR", 2],
      // Unidade de Moeda Europeia
      "XEU": [ "XEU", "XEU", 2],
      // Franco-ouro francês
      "XFO": [ "XFO", "XFO", 2],
      // Franco UIC francês
      "XFU": [ "XFU", "XFU", 2],
      // Franco CFA BCEAO
      "XOF": [ "XOF", "CFA", 0],
      // Paládio
      "XPD": [ "XPD", "XPD", 2],
      // Franco CFP
      "XPF": [ "XPF", "CFPF", 0],
      // Platina
      "XPT": [ "XPT", "XPT", 2],
      // Fundos RINET
      "XRE": [ "XRE", "XRE", 2],
      // Código de Moeda de Teste
      "XTS": [ "XTS", "XTS", 2],
      // Moeda Desconhecida ou Inválida
      "XXX": [ "XXX", "XXX", 2],
      // Dinar iemenita
      "YDD": [ "YDD", "YDD", 130],
      // Rial iemenita
      "YER": [ "YER", "YR", 0, "YER"],
      // Dinar forte iugoslavo
      "YUD": [ "YUD", "YUD", 130],
      // Dinar noviy iugoslavo
      "YUM": [ "YUM", "YUM", 130],
      // Dinar conversível iugoslavo
      "YUN": [ "YUN", "YUN", 130],
      // Rand sul-africano (financeiro)
      "ZAL": [ "ZAL", "ZAL", 2],
      // Rand sul-africano
      "ZAR": [ "ZAR", "R", 2, "ZAR"],
      // Cuacha zambiano
      "ZMK": [ "ZMK", "ZK", 0],
      // Zaire Novo zairense
      "ZRN": [ "ZRN", "NZ", 130],
      // Zaire zairense
      "ZRZ": [ "ZRZ", "ZRZ", 130],
      // Dólar do Zimbábue
      "ZWD": [ "ZWD", "Z$", 128],
    };
  }-*/;
  
  @Override
  protected HashMap<String, String> loadNamesMapJava() {
    HashMap<String, String> result = super.loadNamesMapJava();
    result.put("ADP", "Peseta de Andorra");
    result.put("AED", "Dirém dos Emirados Árabes Unidos");
    result.put("AFA", "Afegane (1927-2002)");
    result.put("AFN", "Afegane");
    result.put("ALL", "Lek Albanês");
    result.put("AMD", "Dram armênio");
    result.put("ANG", "Guilder das Antilhas Holandesas");
    result.put("AOA", "Cuanza angolano");
    result.put("AOK", "Cuanza angolano (1977-1990)");
    result.put("AON", "Novo cuanza angolano (1990-2000)");
    result.put("AOR", "Cuanza angolano reajustado (1995-1999)");
    result.put("ARA", "Austral argentino");
    result.put("ARP", "Peso argentino (1983-1985)");
    result.put("ARS", "Peso argentino");
    result.put("ATS", "Xelim austríaco");
    result.put("AUD", "Dólar australiano");
    result.put("AWG", "Guilder de Aruba");
    result.put("AZM", "Manat azerbaijano");
    result.put("AZN", "Manat do Azerbaijão");
    result.put("BAD", "Dinar da Bósnia-Herzegovina");
    result.put("BAM", "Marco bósnio-herzegovino conversível");
    result.put("BBD", "Dólar de Barbados");
    result.put("BDT", "Taka de Bangladesh");
    result.put("BEC", "Franco belga (conversível)");
    result.put("BEF", "Franco belga");
    result.put("BEL", "Franco belga (financeiro)");
    result.put("BGL", "Lev forte búlgaro");
    result.put("BGN", "Lev novo búlgaro");
    result.put("BHD", "Dinar bareinita");
    result.put("BIF", "Franco do Burundi");
    result.put("BMD", "Dólar das Bermudas");
    result.put("BND", "Dólar do Brunei");
    result.put("BOB", "Boliviano");
    result.put("BOP", "Peso boliviano");
    result.put("BOV", "Mvdol boliviano");
    result.put("BRB", "Cruzeiro novo brasileiro (1967-1986)");
    result.put("BRC", "Cruzado brasileiro");
    result.put("BRE", "Cruzeiro brasileiro (1990-1993)");
    result.put("BRL", "Real brasileiro");
    result.put("BRN", "Cruzado novo brasileiro");
    result.put("BRR", "Cruzeiro brasileiro");
    result.put("BSD", "Dólar das Bahamas");
    result.put("BTN", "Ngultrum do Butão");
    result.put("BUK", "Kyat birmanês");
    result.put("BWP", "Pula botsuanesa");
    result.put("BYB", "Rublo novo bielo-russo (1994-1999)");
    result.put("BYR", "Rublo bielo-russo");
    result.put("BZD", "Dólar do Belize");
    result.put("CAD", "Dólar canadense");
    result.put("CDF", "Franco congolês");
    result.put("CHE", "Euro WIR");
    result.put("CHF", "Franco suíço");
    result.put("CHW", "Franco WIR");
    result.put("CLF", "Unidades de Fomento chilenas");
    result.put("CLP", "Peso chileno");
    result.put("CNY", "Yuan Renminbi chinês");
    result.put("COP", "Peso colombiano");
    result.put("COU", "Unidade de Valor Real");
    result.put("CRC", "Colon da Costa Rica");
    result.put("CSD", "Dinar sérvio antigo");
    result.put("CSK", "Coroa Forte checoslovaca");
    result.put("CUP", "Peso cubano");
    result.put("CVE", "Escudo cabo-verdiano");
    result.put("CYP", "Libra cipriota");
    result.put("CZK", "Coroa checa");
    result.put("DDM", "Ostmark da Alemanha Oriental");
    result.put("DEM", "Marco alemão");
    result.put("DJF", "Franco do Djibuti");
    result.put("DKK", "Coroa dinamarquesa");
    result.put("DOP", "Peso dominicano");
    result.put("DZD", "Dinar argelino");
    result.put("ECS", "Sucre equatoriano");
    result.put("ECV", "Unidade de Valor Constante (UVC) do Equador");
    result.put("EEK", "Coroa estoniana");
    result.put("EGP", "Libra egípcia");
    result.put("ERN", "Nakfa da Eritreia");
    result.put("ESA", "Peseta espanhola (conta A)");
    result.put("ESB", "Peseta espanhola (conta conversível)");
    result.put("ESP", "Peseta espanhola");
    result.put("ETB", "Birr etíope");
    result.put("EUR", "Euro");
    result.put("FIM", "Marca finlandesa");
    result.put("FJD", "Dólar de Fiji");
    result.put("FKP", "Libra das Malvinas");
    result.put("FRF", "Franco francês");
    result.put("GBP", "Libra esterlina britânica");
    result.put("GEK", "Cupom Lari georgiano");
    result.put("GEL", "Lari georgiano");
    result.put("GHC", "Cedi de Gana (1979-2007)");
    result.put("GHS", "Cedi ganês");
    result.put("GIP", "Libra de Gibraltar");
    result.put("GMD", "Dalasi de Gâmbia");
    result.put("GNF", "Franco de Guiné");
    result.put("GNS", "Syli da Guiné");
    result.put("GQE", "Ekwele da Guiné Equatorial");
    result.put("GRD", "Dracma grego");
    result.put("GTQ", "Quetçal da Guatemala");
    result.put("GWE", "Escudo da Guiné Portuguesa");
    result.put("GWP", "Peso da Guiné-Bissau");
    result.put("GYD", "Dólar da Guiana");
    result.put("HKD", "Dólar de Hong Kong");
    result.put("HNL", "Lempira de Honduras");
    result.put("HRD", "Dinar croata");
    result.put("HRK", "Kuna croata");
    result.put("HTG", "Gurde do Haiti");
    result.put("HUF", "Forinte húngaro");
    result.put("IDR", "Rupia indonésia");
    result.put("IEP", "Libra irlandesa");
    result.put("ILP", "Libra israelita");
    result.put("ILR", "Sheqel antigo israelita");
    result.put("ILS", "Sheqel Novo israelita");
    result.put("INR", "Rúpia indiana");
    result.put("IQD", "Dinar iraquiano");
    result.put("IRR", "Rial iraniano");
    result.put("ISJ", "Coroa antiga islandesa");
    result.put("ISK", "Coroa islandesa");
    result.put("ITL", "Lira italiana");
    result.put("JMD", "Dólar jamaicano");
    result.put("JOD", "Dinar jordaniano");
    result.put("JPY", "Iene japonês");
    result.put("KES", "Xelim queniano");
    result.put("KGS", "Som quirguiz");
    result.put("KHR", "Riel cambojano");
    result.put("KMF", "Franco de Comores");
    result.put("KPW", "Won norte-coreano");
    result.put("KRW", "Won sul-coreano");
    result.put("KWD", "Dinar coveitiano");
    result.put("KYD", "Dólar das Ilhas Caiman");
    result.put("KZT", "Tenge do Cazaquistão");
    result.put("LAK", "Kip de Laos");
    result.put("LBP", "Libra libanesa");
    result.put("LKR", "Rupia do Sri Lanka");
    result.put("LRD", "Dólar liberiano");
    result.put("LSL", "Loti do Lesoto");
    result.put("LTL", "Lita lituano");
    result.put("LTT", "Talonas lituano");
    result.put("LUC", "Franco conversível de Luxemburgo");
    result.put("LUF", "Franco luxemburguês");
    result.put("LUL", "Franco financeiro de Luxemburgo");
    result.put("LVL", "Lats letão");
    result.put("LVR", "Rublo letão");
    result.put("LYD", "Dinar líbio");
    result.put("MAD", "Dirém marroquino");
    result.put("MAF", "Franco marroquino");
    result.put("MDL", "Leu moldávio");
    result.put("MGA", "Ariary de Madagascar");
    result.put("MGF", "Franco de Madagascar");
    result.put("MKD", "Dinar macedônio");
    result.put("MLF", "Franco de Mali");
    result.put("MMK", "Kyat de Mianmar");
    result.put("MNT", "Tugrik mongol");
    result.put("MOP", "Pataca macaense");
    result.put("MRO", "Ouguiya da Mauritânia");
    result.put("MTL", "Lira maltesa");
    result.put("MTP", "Libra maltesa");
    result.put("MUR", "Rupia de Maurício");
    result.put("MVR", "Rupias das Ilhas Maldivas");
    result.put("MWK", "Cuacha do Maláui");
    result.put("MXN", "Peso mexicano");
    result.put("MXP", "Peso Prata mexicano (1861-1992)");
    result.put("MXV", "Unidade Mexicana de Investimento (UDI)");
    result.put("MYR", "Ringgit malaio");
    result.put("MZE", "Escudo de Moçambique");
    result.put("MZM", "Metical antigo de Moçambique");
    result.put("MZN", "Metical do Moçambique");
    result.put("NAD", "Dólar da Namíbia");
    result.put("NGN", "Naira nigeriana");
    result.put("NIC", "Córdoba nicaraguense");
    result.put("NIO", "Córdoba Ouro nicaraguense");
    result.put("NLG", "Florim holandês");
    result.put("NOK", "Coroa norueguesa");
    result.put("NPR", "Rupia nepalesa");
    result.put("NZD", "Dólar da Nova Zelândia");
    result.put("OMR", "Rial de Omã");
    result.put("PAB", "Balboa panamenho");
    result.put("PEI", "Inti peruano");
    result.put("PEN", "Sol Novo peruano");
    result.put("PES", "Sol peruano");
    result.put("PGK", "Kina da Papua-Nova Guiné");
    result.put("PHP", "Peso filipino");
    result.put("PKR", "Rupia paquistanesa");
    result.put("PLN", "Zloti polonês");
    result.put("PLZ", "Zloti polonês (1950-1995)");
    result.put("PTE", "Escudo português");
    result.put("PYG", "Guarani paraguaio");
    result.put("QAR", "Rial catariano");
    result.put("RHD", "Dólar rodesiano");
    result.put("ROL", "Leu romeno antigo");
    result.put("RON", "Leu romeno");
    result.put("RSD", "Dinar sérvio");
    result.put("RUB", "Rublo russo");
    result.put("RUR", "Rublo russo (1991-1998)");
    result.put("RWF", "Franco ruandês");
    result.put("SAR", "Rial saudita");
    result.put("SBD", "Dólar das Ilhas Salomão");
    result.put("SCR", "Rupia das Seychelles");
    result.put("SDD", "Dinar sudanês");
    result.put("SDG", "Libra sudanesa");
    result.put("SDP", "Libra sudanesa antiga");
    result.put("SEK", "Coroa sueca");
    result.put("SGD", "Dólar de Cingapura");
    result.put("SHP", "Libra de Santa Helena");
    result.put("SIT", "Tolar Bons esloveno");
    result.put("SKK", "Coroa eslovaca");
    result.put("SLL", "Leone de Serra Leoa");
    result.put("SOS", "Xelim somali");
    result.put("SRD", "Dólar do Suriname");
    result.put("SRG", "Florim do Suriname");
    result.put("STD", "Dobra de São Tomé e Príncipe");
    result.put("SUR", "Rublo soviético");
    result.put("SVC", "Colom salvadorenho");
    result.put("SYP", "Libra síria");
    result.put("SZL", "Lilangeni da Suazilândia");
    result.put("THB", "Baht tailandês");
    result.put("TJR", "Rublo do Tadjiquistão");
    result.put("TJS", "Somoni tadjique");
    result.put("TMM", "Manat do Turcomenistão");
    result.put("TND", "Dinar tunisiano");
    result.put("TOP", "Paʻanga de Tonga");
    result.put("TPE", "Escudo timorense");
    result.put("TRL", "Lira turca antiga");
    result.put("TRY", "Lira turca");
    result.put("TTD", "Dólar de Trinidad e Tobago");
    result.put("TWD", "Dólar Novo de Taiwan");
    result.put("TZS", "Xelim da Tanzânia");
    result.put("UAH", "Hryvnia ucraniano");
    result.put("UAK", "Karbovanetz ucraniano");
    result.put("UGS", "Xelim ugandense (1966-1987)");
    result.put("UGX", "Xelim ugandense");
    result.put("USD", "Dólar norte-americano");
    result.put("USN", "Dólar norte-americano (Dia seguinte)");
    result.put("USS", "Dólar norte-americano (Mesmo dia)");
    result.put("UYI", "Peso uruguaio en unidades indexadas");
    result.put("UYP", "Peso uruguaio (1975-1993)");
    result.put("UYU", "Peso uruguaio");
    result.put("UZS", "Sum do Usbequistão");
    result.put("VEB", "Bolívar venezuelano");
    result.put("VEF", "Bolívar v enezuelano forte");
    result.put("VND", "Dong vietnamita");
    result.put("VUV", "Vatu de Vanuatu");
    result.put("WST", "Tala samoano");
    result.put("XAF", "Franco CFA BEAC");
    result.put("XAG", "Prata");
    result.put("XAU", "Ouro");
    result.put("XBA", "Unidade Composta Europeia");
    result.put("XBB", "Unidade Monetária Europeia");
    result.put("XBC", "Unidade de Conta Europeia (XBC)");
    result.put("XBD", "Unidade de Conta Europeia (XBD)");
    result.put("XCD", "Dólar do Caribe Oriental");
    result.put("XDR", "Direitos Especiais de Giro");
    result.put("XEU", "Unidade de Moeda Europeia");
    result.put("XFO", "Franco-ouro francês");
    result.put("XFU", "Franco UIC francês");
    result.put("XOF", "Franco CFA BCEAO");
    result.put("XPD", "Paládio");
    result.put("XPF", "Franco CFP");
    result.put("XPT", "Platina");
    result.put("XRE", "Fundos RINET");
    result.put("XTS", "Código de Moeda de Teste");
    result.put("XXX", "Moeda Desconhecida ou Inválida");
    result.put("YDD", "Dinar iemenita");
    result.put("YER", "Rial iemenita");
    result.put("YUD", "Dinar forte iugoslavo");
    result.put("YUM", "Dinar noviy iugoslavo");
    result.put("YUN", "Dinar conversível iugoslavo");
    result.put("ZAL", "Rand sul-africano (financeiro)");
    result.put("ZAR", "Rand sul-africano");
    result.put("ZMK", "Cuacha zambiano");
    result.put("ZRN", "Zaire Novo zairense");
    result.put("ZRZ", "Zaire zairense");
    result.put("ZWD", "Dólar do Zimbábue");
    return result;
  }
  
  @Override
  protected JavaScriptObject loadNamesMapNative() {
    return overrideMap(super.loadNamesMapNative(), loadMyNamesMapOverridesNative());
  }
  
  private native JavaScriptObject loadMyNamesMapOverridesNative() /*-{
    return {
      "ADP": "Peseta de Andorra",
      "AED": "Dirém dos Emirados Árabes Unidos",
      "AFA": "Afegane (1927-2002)",
      "AFN": "Afegane",
      "ALL": "Lek Albanês",
      "AMD": "Dram armênio",
      "ANG": "Guilder das Antilhas Holandesas",
      "AOA": "Cuanza angolano",
      "AOK": "Cuanza angolano (1977-1990)",
      "AON": "Novo cuanza angolano (1990-2000)",
      "AOR": "Cuanza angolano reajustado (1995-1999)",
      "ARA": "Austral argentino",
      "ARP": "Peso argentino (1983-1985)",
      "ARS": "Peso argentino",
      "ATS": "Xelim austríaco",
      "AUD": "Dólar australiano",
      "AWG": "Guilder de Aruba",
      "AZM": "Manat azerbaijano",
      "AZN": "Manat do Azerbaijão",
      "BAD": "Dinar da Bósnia-Herzegovina",
      "BAM": "Marco bósnio-herzegovino conversível",
      "BBD": "Dólar de Barbados",
      "BDT": "Taka de Bangladesh",
      "BEC": "Franco belga (conversível)",
      "BEF": "Franco belga",
      "BEL": "Franco belga (financeiro)",
      "BGL": "Lev forte búlgaro",
      "BGN": "Lev novo búlgaro",
      "BHD": "Dinar bareinita",
      "BIF": "Franco do Burundi",
      "BMD": "Dólar das Bermudas",
      "BND": "Dólar do Brunei",
      "BOB": "Boliviano",
      "BOP": "Peso boliviano",
      "BOV": "Mvdol boliviano",
      "BRB": "Cruzeiro novo brasileiro (1967-1986)",
      "BRC": "Cruzado brasileiro",
      "BRE": "Cruzeiro brasileiro (1990-1993)",
      "BRL": "Real brasileiro",
      "BRN": "Cruzado novo brasileiro",
      "BRR": "Cruzeiro brasileiro",
      "BSD": "Dólar das Bahamas",
      "BTN": "Ngultrum do Butão",
      "BUK": "Kyat birmanês",
      "BWP": "Pula botsuanesa",
      "BYB": "Rublo novo bielo-russo (1994-1999)",
      "BYR": "Rublo bielo-russo",
      "BZD": "Dólar do Belize",
      "CAD": "Dólar canadense",
      "CDF": "Franco congolês",
      "CHE": "Euro WIR",
      "CHF": "Franco suíço",
      "CHW": "Franco WIR",
      "CLF": "Unidades de Fomento chilenas",
      "CLP": "Peso chileno",
      "CNY": "Yuan Renminbi chinês",
      "COP": "Peso colombiano",
      "COU": "Unidade de Valor Real",
      "CRC": "Colon da Costa Rica",
      "CSD": "Dinar sérvio antigo",
      "CSK": "Coroa Forte checoslovaca",
      "CUP": "Peso cubano",
      "CVE": "Escudo cabo-verdiano",
      "CYP": "Libra cipriota",
      "CZK": "Coroa checa",
      "DDM": "Ostmark da Alemanha Oriental",
      "DEM": "Marco alemão",
      "DJF": "Franco do Djibuti",
      "DKK": "Coroa dinamarquesa",
      "DOP": "Peso dominicano",
      "DZD": "Dinar argelino",
      "ECS": "Sucre equatoriano",
      "ECV": "Unidade de Valor Constante (UVC) do Equador",
      "EEK": "Coroa estoniana",
      "EGP": "Libra egípcia",
      "ERN": "Nakfa da Eritreia",
      "ESA": "Peseta espanhola (conta A)",
      "ESB": "Peseta espanhola (conta conversível)",
      "ESP": "Peseta espanhola",
      "ETB": "Birr etíope",
      "EUR": "Euro",
      "FIM": "Marca finlandesa",
      "FJD": "Dólar de Fiji",
      "FKP": "Libra das Malvinas",
      "FRF": "Franco francês",
      "GBP": "Libra esterlina britânica",
      "GEK": "Cupom Lari georgiano",
      "GEL": "Lari georgiano",
      "GHC": "Cedi de Gana (1979-2007)",
      "GHS": "Cedi ganês",
      "GIP": "Libra de Gibraltar",
      "GMD": "Dalasi de Gâmbia",
      "GNF": "Franco de Guiné",
      "GNS": "Syli da Guiné",
      "GQE": "Ekwele da Guiné Equatorial",
      "GRD": "Dracma grego",
      "GTQ": "Quetçal da Guatemala",
      "GWE": "Escudo da Guiné Portuguesa",
      "GWP": "Peso da Guiné-Bissau",
      "GYD": "Dólar da Guiana",
      "HKD": "Dólar de Hong Kong",
      "HNL": "Lempira de Honduras",
      "HRD": "Dinar croata",
      "HRK": "Kuna croata",
      "HTG": "Gurde do Haiti",
      "HUF": "Forinte húngaro",
      "IDR": "Rupia indonésia",
      "IEP": "Libra irlandesa",
      "ILP": "Libra israelita",
      "ILR": "Sheqel antigo israelita",
      "ILS": "Sheqel Novo israelita",
      "INR": "Rúpia indiana",
      "IQD": "Dinar iraquiano",
      "IRR": "Rial iraniano",
      "ISJ": "Coroa antiga islandesa",
      "ISK": "Coroa islandesa",
      "ITL": "Lira italiana",
      "JMD": "Dólar jamaicano",
      "JOD": "Dinar jordaniano",
      "JPY": "Iene japonês",
      "KES": "Xelim queniano",
      "KGS": "Som quirguiz",
      "KHR": "Riel cambojano",
      "KMF": "Franco de Comores",
      "KPW": "Won norte-coreano",
      "KRW": "Won sul-coreano",
      "KWD": "Dinar coveitiano",
      "KYD": "Dólar das Ilhas Caiman",
      "KZT": "Tenge do Cazaquistão",
      "LAK": "Kip de Laos",
      "LBP": "Libra libanesa",
      "LKR": "Rupia do Sri Lanka",
      "LRD": "Dólar liberiano",
      "LSL": "Loti do Lesoto",
      "LTL": "Lita lituano",
      "LTT": "Talonas lituano",
      "LUC": "Franco conversível de Luxemburgo",
      "LUF": "Franco luxemburguês",
      "LUL": "Franco financeiro de Luxemburgo",
      "LVL": "Lats letão",
      "LVR": "Rublo letão",
      "LYD": "Dinar líbio",
      "MAD": "Dirém marroquino",
      "MAF": "Franco marroquino",
      "MDL": "Leu moldávio",
      "MGA": "Ariary de Madagascar",
      "MGF": "Franco de Madagascar",
      "MKD": "Dinar macedônio",
      "MLF": "Franco de Mali",
      "MMK": "Kyat de Mianmar",
      "MNT": "Tugrik mongol",
      "MOP": "Pataca macaense",
      "MRO": "Ouguiya da Mauritânia",
      "MTL": "Lira maltesa",
      "MTP": "Libra maltesa",
      "MUR": "Rupia de Maurício",
      "MVR": "Rupias das Ilhas Maldivas",
      "MWK": "Cuacha do Maláui",
      "MXN": "Peso mexicano",
      "MXP": "Peso Prata mexicano (1861-1992)",
      "MXV": "Unidade Mexicana de Investimento (UDI)",
      "MYR": "Ringgit malaio",
      "MZE": "Escudo de Moçambique",
      "MZM": "Metical antigo de Moçambique",
      "MZN": "Metical do Moçambique",
      "NAD": "Dólar da Namíbia",
      "NGN": "Naira nigeriana",
      "NIC": "Córdoba nicaraguense",
      "NIO": "Córdoba Ouro nicaraguense",
      "NLG": "Florim holandês",
      "NOK": "Coroa norueguesa",
      "NPR": "Rupia nepalesa",
      "NZD": "Dólar da Nova Zelândia",
      "OMR": "Rial de Omã",
      "PAB": "Balboa panamenho",
      "PEI": "Inti peruano",
      "PEN": "Sol Novo peruano",
      "PES": "Sol peruano",
      "PGK": "Kina da Papua-Nova Guiné",
      "PHP": "Peso filipino",
      "PKR": "Rupia paquistanesa",
      "PLN": "Zloti polonês",
      "PLZ": "Zloti polonês (1950-1995)",
      "PTE": "Escudo português",
      "PYG": "Guarani paraguaio",
      "QAR": "Rial catariano",
      "RHD": "Dólar rodesiano",
      "ROL": "Leu romeno antigo",
      "RON": "Leu romeno",
      "RSD": "Dinar sérvio",
      "RUB": "Rublo russo",
      "RUR": "Rublo russo (1991-1998)",
      "RWF": "Franco ruandês",
      "SAR": "Rial saudita",
      "SBD": "Dólar das Ilhas Salomão",
      "SCR": "Rupia das Seychelles",
      "SDD": "Dinar sudanês",
      "SDG": "Libra sudanesa",
      "SDP": "Libra sudanesa antiga",
      "SEK": "Coroa sueca",
      "SGD": "Dólar de Cingapura",
      "SHP": "Libra de Santa Helena",
      "SIT": "Tolar Bons esloveno",
      "SKK": "Coroa eslovaca",
      "SLL": "Leone de Serra Leoa",
      "SOS": "Xelim somali",
      "SRD": "Dólar do Suriname",
      "SRG": "Florim do Suriname",
      "STD": "Dobra de São Tomé e Príncipe",
      "SUR": "Rublo soviético",
      "SVC": "Colom salvadorenho",
      "SYP": "Libra síria",
      "SZL": "Lilangeni da Suazilândia",
      "THB": "Baht tailandês",
      "TJR": "Rublo do Tadjiquistão",
      "TJS": "Somoni tadjique",
      "TMM": "Manat do Turcomenistão",
      "TND": "Dinar tunisiano",
      "TOP": "Paʻanga de Tonga",
      "TPE": "Escudo timorense",
      "TRL": "Lira turca antiga",
      "TRY": "Lira turca",
      "TTD": "Dólar de Trinidad e Tobago",
      "TWD": "Dólar Novo de Taiwan",
      "TZS": "Xelim da Tanzânia",
      "UAH": "Hryvnia ucraniano",
      "UAK": "Karbovanetz ucraniano",
      "UGS": "Xelim ugandense (1966-1987)",
      "UGX": "Xelim ugandense",
      "USD": "Dólar norte-americano",
      "USN": "Dólar norte-americano (Dia seguinte)",
      "USS": "Dólar norte-americano (Mesmo dia)",
      "UYI": "Peso uruguaio en unidades indexadas",
      "UYP": "Peso uruguaio (1975-1993)",
      "UYU": "Peso uruguaio",
      "UZS": "Sum do Usbequistão",
      "VEB": "Bolívar venezuelano",
      "VEF": "Bolívar v enezuelano forte",
      "VND": "Dong vietnamita",
      "VUV": "Vatu de Vanuatu",
      "WST": "Tala samoano",
      "XAF": "Franco CFA BEAC",
      "XAG": "Prata",
      "XAU": "Ouro",
      "XBA": "Unidade Composta Europeia",
      "XBB": "Unidade Monetária Europeia",
      "XBC": "Unidade de Conta Europeia (XBC)",
      "XBD": "Unidade de Conta Europeia (XBD)",
      "XCD": "Dólar do Caribe Oriental",
      "XDR": "Direitos Especiais de Giro",
      "XEU": "Unidade de Moeda Europeia",
      "XFO": "Franco-ouro francês",
      "XFU": "Franco UIC francês",
      "XOF": "Franco CFA BCEAO",
      "XPD": "Paládio",
      "XPF": "Franco CFP",
      "XPT": "Platina",
      "XRE": "Fundos RINET",
      "XTS": "Código de Moeda de Teste",
      "XXX": "Moeda Desconhecida ou Inválida",
      "YDD": "Dinar iemenita",
      "YER": "Rial iemenita",
      "YUD": "Dinar forte iugoslavo",
      "YUM": "Dinar noviy iugoslavo",
      "YUN": "Dinar conversível iugoslavo",
      "ZAL": "Rand sul-africano (financeiro)",
      "ZAR": "Rand sul-africano",
      "ZMK": "Cuacha zambiano",
      "ZRN": "Zaire Novo zairense",
      "ZRZ": "Zaire zairense",
      "ZWD": "Dólar do Zimbábue",
    };
  }-*/;
}
