package com.xworkz.collection.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xworkz.collection.dto.CountryDTO;
import com.xworkz.collection.dto.MatchBoxDTO;
import com.xworkz.collection.eNum.Code;
import com.xworkz.collection.eNum.Continent;

public class CountryRunner {

	public static void main(String[] args) {

		CountryDTO countryDTO1 = new CountryDTO("AFGHANISTAN",Code.AFG, 38928346L, "Hibatullah Akhundzada",Continent.ASIA);
		CountryDTO countryDTO2 = new CountryDTO("ALBANIA",Code.ALB , 2877797L, "Bajram Begaj",Continent.EUROPE);
		CountryDTO countryDTO3 = new CountryDTO("ALGERIA",Code.DZA, 43851044L, "Abdelmadjid Tebboune",Continent.AFRICA);
		CountryDTO countryDTO4 = new CountryDTO("ANDORRA", Code.AND, 77265L, "Xavier Espot Zamora", Continent.EUROPE);
		CountryDTO countryDTO5 = new CountryDTO("ANGOLA", Code.AGO, 32866272L, "João Lourenço", Continent.AFRICA);
		CountryDTO countryDTO6 = new CountryDTO("ANTIGUA AND BARBUDA", Code.ATG, 97929L, "Gaston Browne", Continent.NORTHAMERICA);
		CountryDTO countryDTO7 = new CountryDTO("ARGENTINA", Code.ARG, 45195774L, "Alberto Fernández", Continent.SOUTHAMERICA);
		CountryDTO countryDTO8 = new CountryDTO("ARMENIA", Code.ARM, 2963243L, "Vahagn Khachaturyan",Continent.ASIA);
		CountryDTO countryDTO9 = new CountryDTO("AUSTRALIA", Code.AUS, 25499884L, "Peter Dutton",Continent.OCEANIA);
		CountryDTO countryDTO10 = new CountryDTO("AUSTRIA", Code.AUT, 9006398L, "Alexander Van der Bellen",Continent.EUROPE);
		CountryDTO countryDTO11 = new CountryDTO("AZERBAIJAN", Code.AZE, 10139177L, "Ilham Aliyev",Continent.ASIA);
		CountryDTO countryDTO12 = new CountryDTO("BAHAMAS", Code.BHS, 393248L, "Philip Davis",Continent.NORTHAMERICA);
		CountryDTO countryDTO13 = new CountryDTO("BAHRAIN", Code.BHR, 1701575L, "Hamad bin Isa Al Khalifa",Continent.ASIA);
		CountryDTO countryDTO14 = new CountryDTO("BANGLADESH", Code.BGD, 164689383L, "Mohammed Shahabuddin", Continent.ASIA);
		CountryDTO countryDTO15 = new CountryDTO("BARBADOS", Code.BRB, 287375L, "Sandra Mason",Continent.NORTHAMERICA);
		CountryDTO countryDTO16 = new CountryDTO("BELARUS", Code.BLR, 9449323L, "Alexander Lukashenko",Continent.EUROPE);
		CountryDTO countryDTO17 = new CountryDTO("BELGIUM", Code.BEL, 11589623L, "Alexander De Croo",Continent.EUROPE);
		CountryDTO countryDTO18 = new CountryDTO("BELIZE", Code.BLZ, 397621L, "Bernard Wagner",Continent.NORTHAMERICA);
		CountryDTO countryDTO19 = new CountryDTO("BENIN", Code.BEN, 12123200L, "Patrice Talon",Continent.AFRICA);
		CountryDTO countryDTO20 = new CountryDTO("BHUTAN", Code.BTN, 771608L, "Lotay Tshering",Continent.ASIA);
		CountryDTO countryDTO21 = new CountryDTO("BOLIVIA", Code.BOL, 11673021L, "Luis Arce",Continent.SOUTHAMERICA);
		CountryDTO countryDTO22 = new CountryDTO("BOSNIA AND HERZEGOVINA", Code.BIH, 3280819L, "Šefik Džaferović",Continent.EUROPE);
		CountryDTO countryDTO23 = new CountryDTO("BOTSWANA",Code.BWA, 2141206L, "Mokgweetsi Masisi",Continent.AFRICA);
		CountryDTO countryDTO24 = new CountryDTO("BRAZIL",Code.BRA, 211049527L, "Luiz Inácio Lula da Silva",Continent.SOUTHAMERICA);
		CountryDTO countryDTO25 = new CountryDTO("BRUNEI", Code.BRN, 437483L, "Sultan Hassanal Bolkiah",Continent.ASIA);
		CountryDTO countryDTO26 = new CountryDTO("BULGARIA", Code.BGR, 6948445L, "Rumen Radev",Continent.EUROPE);
		CountryDTO countryDTO27 = new CountryDTO("BURKINA FASO", Code.BFA, 19034397L, "Roch Marc Christian Kaboré",Continent.AFRICA);
		CountryDTO countryDTO28 = new CountryDTO("BURUNDI", Code.BDI, 10114505L, "Evariste Ndayishimiye",Continent.AFRICA);
		CountryDTO countryDTO29 = new CountryDTO("CABO VERDE",Code.CPV, 531239L, "Jorge Carlos Fonseca",Continent.AFRICA);
		CountryDTO countryDTO30 = new CountryDTO("CAMBODIA",Code.KHM, 16718971L, "Hun Sen",Continent.ASIA);
		CountryDTO countryDTO31 = new CountryDTO("CANADA", Code.CAN, 37742154L, "Justin Trudeau", Continent.NORTHAMERICA);
		CountryDTO countryDTO32 = new CountryDTO("CENTRAL AFRICAN REPUBLIC", Code.CAF, 4829767L, "Faustin-Archange Touadéra", Continent.AFRICA);
		CountryDTO countryDTO33 = new CountryDTO("CHAD", Code.TCD, 16425864L, "Mahamat Déby", Continent.AFRICA);
		CountryDTO countryDTO34 = new CountryDTO("CHILE", Code.CHL, 19116201L, "Sebastián Piñera", Continent.SOUTHAMERICA);
		CountryDTO countryDTO35 = new CountryDTO("CHINA", Code.CHN, 1439323776L, "Xi Jinping", Continent.ASIA);
		CountryDTO countryDTO36 = new CountryDTO("COLOMBIA", Code.COL, 50882891L, "Iván Duque Márquez", Continent.SOUTHAMERICA);
		CountryDTO countryDTO37 = new CountryDTO("COMOROS", Code.COM, 869601L, "Azali Assoumani", Continent.AFRICA);
		CountryDTO countryDTO38 = new CountryDTO("CONGO, DEMOCRATIC REPUBLIC OF THE", Code.COG, 89561403L, "Félix Tshisekedi", Continent.AFRICA);
		CountryDTO countryDTO39 = new CountryDTO("CONGO, REPUBLIC OF THE", Code.COG, 5518092L, "Denis Sassou Nguesso", Continent.AFRICA);
		CountryDTO countryDTO40 = new CountryDTO("COSTA RICA", Code.CRI, 5094118L, "Carlos Alvarado Quesada", Continent.NORTHAMERICA);
		CountryDTO countryDTO41 = new CountryDTO("CROATIA", Code.HRV, 4105267L, "Zoran Milanović", Continent.EUROPE);
		CountryDTO countryDTO42 = new CountryDTO("CUBA", Code.CUB, 11326616L, "Miguel Díaz-Canel", Continent.NORTHAMERICA);
		CountryDTO countryDTO43 = new CountryDTO("CYPRUS", Code.CYP, 1207359L, "Nikos Anastasiades", Continent.EUROPE);
		CountryDTO countryDTO44 = new CountryDTO("CZECHIA", Code.CZE, 10708981L, "Miloš Zeman", Continent.EUROPE);
		CountryDTO countryDTO45 = new CountryDTO("DENMARK", Code.DNK, 5818553L, "Mette Frederiksen", Continent.EUROPE);
		CountryDTO countryDTO46 = new CountryDTO("DJIBOUTI", Code.DJI, 988000L, "Ismaïl Omar Guelleh", Continent.AFRICA);
		CountryDTO countryDTO47 = new CountryDTO("DOMINICA", Code.DMA, 71986L, "Roosevelt Skerrit", Continent.NORTHAMERICA);
		CountryDTO countryDTO48 = new CountryDTO("DOMINICAN REPUBLIC", Code.DOM, 10847910L, "Luis Abinader", Continent.NORTHAMERICA);
		CountryDTO countryDTO49 = new CountryDTO("ECUADOR", Code.ECU, 17643054L, "Guillermo Lasso", Continent.SOUTHAMERICA);
		CountryDTO countryDTO50 = new CountryDTO("EGYPT", Code.EGY, 102334404L, "Abdel Fattah el-Sisi", Continent.AFRICA);
		CountryDTO countryDTO51 = new CountryDTO("EL SALVADOR", Code.SLV, 6486205L, "Nayib Bukele", Continent.NORTHAMERICA);
		CountryDTO countryDTO52 = new CountryDTO("EQUATORIAL GUINEA", Code.GNQ, 1402985L, "Teodoro Obiang Nguema Mbasogo", Continent.AFRICA);
		CountryDTO countryDTO53 = new CountryDTO("ERITREA", Code.ERI, 3546000L, "Isaias Afwerki", Continent.AFRICA);
		CountryDTO countryDTO54 = new CountryDTO("ESTONIA", Code.EST, 1326535L, "Kersti Kaljulaid", Continent.EUROPE);
		CountryDTO countryDTO55 = new CountryDTO("ESWATINI", Code.SWZ, 1160164L, "Mswati III", Continent.AFRICA);
		CountryDTO countryDTO56 = new CountryDTO("ETHIOPIA", Code.ETH, 114963588L, "Abiy Ahmed", Continent.AFRICA);
		CountryDTO countryDTO57 = new CountryDTO("FIJI", Code.FJI, 896445L, "Jioji Konrote", Continent.OCEANIA);
		CountryDTO countryDTO58 = new CountryDTO("FINLAND", Code.FIN, 5540720L, "Sauli Niinistö", Continent.EUROPE);
		CountryDTO countryDTO59 = new CountryDTO("FRANCE", Code.FRA, 65273511L, "Emmanuel Macron", Continent.EUROPE);
		CountryDTO countryDTO60 = new CountryDTO("GABON", Code.GAB, 2225734L, "Ali Bongo Ondimba", Continent.AFRICA);
		CountryDTO countryDTO61 = new CountryDTO("GAMBIA", Code.GMB, 2416668L, "Adama Barrow", Continent.AFRICA);
		CountryDTO countryDTO62 = new CountryDTO("GEORGIA", Code.GEO, 3989167L, "Salome Zourabichvili", Continent.EUROPE);
		CountryDTO countryDTO63 = new CountryDTO("GERMANY", Code.DEU, 83783942L, "Frank-Walter Steinmeier", Continent.EUROPE);
		CountryDTO countryDTO64 = new CountryDTO("GHANA", Code.GHA, 31072940L, "Nana Akufo-Addo", Continent.AFRICA);
		CountryDTO countryDTO65 = new CountryDTO("GREECE", Code.GRC, 10423054L, "Katerina Sakellaropoulou", Continent.EUROPE);
		CountryDTO countryDTO66 = new CountryDTO("GRENADA", Code.GRD, 112523L, "Keith Mitchell", Continent.NORTHAMERICA);
		CountryDTO countryDTO67 = new CountryDTO("GUATEMALA", Code.GTM, 17915568L, "Alejandro Giammattei", Continent.NORTHAMERICA);
		CountryDTO countryDTO68 = new CountryDTO("GUINEA", Code.GIN, 13132795L, "Alpha Condé", Continent.AFRICA);
		CountryDTO countryDTO69 = new CountryDTO("GUINEA-BISSAU", Code.GNB, 1968001L, "Umaro Sissoco Embaló", Continent.AFRICA);
		CountryDTO countryDTO70 = new CountryDTO("GUYANA", Code.GUY, 786552L, "Irfaan Ali", Continent.SOUTHAMERICA);
		CountryDTO countryDTO71 = new CountryDTO("HAITI", Code.HTI, 11402528L, "Jovenel Moïse", Continent.NORTHAMERICA);
		CountryDTO countryDTO72 = new CountryDTO("HONDURAS", Code.HND, 9904608L, "Juan Orlando Hernández", Continent.NORTHAMERICA);
		CountryDTO countryDTO73 = new CountryDTO("HUNGARY", Code.HUN, 9660351L, "János Áder", Continent.EUROPE);
		CountryDTO countryDTO74 = new CountryDTO("ICELAND", Code.ISL, 341243L, "Guðni Th. Jóhannesson", Continent.EUROPE);
		CountryDTO countryDTO75 = new CountryDTO("INDIA", Code.IND, 1380004385L, "Ram Nath Kovind", Continent.ASIA);
		CountryDTO countryDTO76 = new CountryDTO("INDONESIA", Code.IDN, 273523615L, "Joko Widodo", Continent.ASIA);
		CountryDTO countryDTO77 = new CountryDTO("IRAN", Code.IRN, 83992949L, "Hassan Rouhani", Continent.ASIA);
		CountryDTO countryDTO78 = new CountryDTO("IRAQ", Code.IRQ, 40222493L, "Barham Salih", Continent.ASIA);
		CountryDTO countryDTO79 = new CountryDTO("IRELAND", Code.IRL, 4937786L, "Michael D. Higgins", Continent.EUROPE);
		CountryDTO countryDTO80 = new CountryDTO("ISRAEL", Code.ISR, 8655535L, "Reuven Rivlin", Continent.ASIA);
		CountryDTO countryDTO81 = new CountryDTO("ITALY", Code.ITA, 60244639L, "Sergio Mattarella", Continent.EUROPE);
		CountryDTO countryDTO82 = new CountryDTO("JAMAICA", Code.JAM, 2961167L, "Andrew Holness", Continent.NORTHAMERICA);
		CountryDTO countryDTO83 = new CountryDTO("JAPAN", Code.JPN, 126476461L, "Yoshihide Suga", Continent.ASIA);
		CountryDTO countryDTO84 = new CountryDTO("JORDAN", Code.JOR, 10203134L, "Abdullah II", Continent.ASIA);
		CountryDTO countryDTO85 = new CountryDTO("KAZAKHSTAN", Code.KAZ, 18776707L, "Kassym-Jomart Tokayev", Continent.ASIA);
		CountryDTO countryDTO86 = new CountryDTO("KENYA", Code.KEN, 53771296L, "Uhuru Kenyatta", Continent.AFRICA);
		CountryDTO countryDTO87 = new CountryDTO("KIRIBATI", Code.KIR, 119446L, "Taneti Maamau", Continent.OCEANIA);
		CountryDTO countryDTO88 = new CountryDTO("KOSOVO", Code.KOR, 1831000L, "Vjosa Osmani", Continent.EUROPE);
		CountryDTO countryDTO89 = new CountryDTO("KUWAIT", Code.KWT, 4270571L, "Nawaf Al-Ahmad Al-Jaber Al-Sabah", Continent.ASIA);
		CountryDTO countryDTO90 = new CountryDTO("KYRGYZSTAN", Code.KGZ, 6524195L, "Sadyr Japarov", Continent.ASIA);
		CountryDTO countryDTO91 = new CountryDTO("LAOS", Code.LAO, 7275560L, "Thongloun Sisoulith", Continent.ASIA);
		CountryDTO countryDTO92 = new CountryDTO("LATVIA", Code.LVA, 1886198L, "Egils Levits", Continent.EUROPE);
		CountryDTO countryDTO93 = new CountryDTO("LEBANON", Code.LBN, 6825445L, "Michel Aoun", Continent.ASIA);
		CountryDTO countryDTO94 = new CountryDTO("LESOTHO", Code.LSO, 2142249L, "Moeketsi Majoro", Continent.AFRICA);
		CountryDTO countryDTO95 = new CountryDTO("LIBERIA", Code.LBR, 5057681L, "George Weah", Continent.AFRICA);
		CountryDTO countryDTO96 = new CountryDTO("LIBYA", Code.LBY, 6871292L, "Mohamed al-Menfi", Continent.AFRICA);
		CountryDTO countryDTO97 = new CountryDTO("LIECHTENSTEIN", Code.LIE, 38128L, "Alois, Hereditary Prince of Liechtenstein", Continent.EUROPE);
		CountryDTO countryDTO98 = new CountryDTO("LITHUANIA", Code.LTU, 2722289L, "Gitanas Nausėda", Continent.EUROPE);
		CountryDTO countryDTO99 = new CountryDTO("LUXEMBOURG", Code.LUX, 634814L, "Xavier Bettel", Continent.EUROPE);
		CountryDTO countryDTO100 = new CountryDTO("MADAGASCAR", Code.MDG, 27691018L, "Andry Rajoelina", Continent.AFRICA);
		CountryDTO countryDTO101 = new CountryDTO("MALAWI", Code.MWI, 19129952L, "Lazarus Chakwera", Continent.AFRICA);
		CountryDTO countryDTO102 = new CountryDTO("MALAYSIA", Code.MYS, 32365999L, "Muhyiddin Yassin", Continent.ASIA);
		CountryDTO countryDTO103 = new CountryDTO("MALDIVES", Code.MDV, 540544L, "Ibrahim Mohamed Solih", Continent.ASIA);
		CountryDTO countryDTO104 = new CountryDTO("MALI", Code.MLI, 20250833L, "Bah N'Daw", Continent.AFRICA);
		CountryDTO countryDTO105 = new CountryDTO("MALTA", Code.MLT, 514564L, "George Vella", Continent.EUROPE);
		CountryDTO countryDTO106 = new CountryDTO("MARSHALL ISLANDS", Code.MHL, 59190L, "David Kabua", Continent.OCEANIA);
		CountryDTO countryDTO107 = new CountryDTO("MAURITANIA", Code.MRT, 4649658L, "Mohamed Ould Ghazouani", Continent.AFRICA);
		CountryDTO countryDTO108 = new CountryDTO("MAURITIUS", Code.MUS, 1271768L, "Prithvirajsing Roopun", Continent.AFRICA);
		CountryDTO countryDTO109 = new CountryDTO("MEXICO", Code.MEX, 128932753L, "Andrés Manuel López Obrador", Continent.NORTHAMERICA);
		CountryDTO countryDTO110 = new CountryDTO("MICRONESIA", Code.FSM, 115023L, "David Panuelo", Continent.OCEANIA);
		CountryDTO countryDTO111 = new CountryDTO("MOLDOVA", Code.MDA, 2657637L, "Maia Sandu", Continent.EUROPE);
		CountryDTO countryDTO112 = new CountryDTO("MONACO", Code.MCO, 39242L, "Albert II", Continent.EUROPE);
		CountryDTO countryDTO113 = new CountryDTO("MONGOLIA", Code.MNG, 3278290L, "Khaltmaagiin Battulga", Continent.ASIA);
		CountryDTO countryDTO114 = new CountryDTO("MONTENEGRO", Code.MNG, 622359L, "Milo Đukanović", Continent.EUROPE);
		CountryDTO countryDTO115 = new CountryDTO("MOROCCO", Code.MAR, 36910560L, "Mohammed VI", Continent.AFRICA);
		CountryDTO countryDTO116 = new CountryDTO("MOZAMBIQUE", Code.MOZ, 31255435L, "Filipe Nyusi", Continent.AFRICA);
		CountryDTO countryDTO117 = new CountryDTO("MYANMAR", Code.MMR, 54409800L, "Min Aung Hlaing", Continent.ASIA);
		CountryDTO countryDTO118 = new CountryDTO("NAMIBIA", Code.NAM, 2540905L, "Hage Geingob", Continent.AFRICA);
		CountryDTO countryDTO119 = new CountryDTO("NAURU", Code.NRU, 10824L, "Lionel Aingimea", Continent.OCEANIA);
		CountryDTO countryDTO120 = new CountryDTO("NEPAL", Code.NPL, 29136808L, "Bidhya Devi Bhandari", Continent.ASIA);
		CountryDTO countryDTO121 = new CountryDTO("NETHERLANDS", Code.NLD, 17134872L, "Willem-Alexander", Continent.EUROPE);
		CountryDTO countryDTO122 = new CountryDTO("NEW ZEALAND", Code.NZL, 4822233L, "Jacinda Ardern", Continent.OCEANIA);
		CountryDTO countryDTO123 = new CountryDTO("NICARAGUA", Code.NIC, 6624554L, "Daniel Ortega", Continent.NORTHAMERICA);
		CountryDTO countryDTO124 = new CountryDTO("NIGER", Code.NER, 24206644L, "Mohamed Bazoum", Continent.AFRICA);
		CountryDTO countryDTO125 = new CountryDTO("NIGERIA", Code.NGA, 206139589L, "Muhammadu Buhari", Continent.AFRICA);
		CountryDTO countryDTO126 = new CountryDTO("NORTH KOREA", Code.PRK, 25778816L, "Kim Jong-un", Continent.ASIA);
		CountryDTO countryDTO127 = new CountryDTO("NORTH MACEDONIA", Code.MKD, 2083459L, "Stevo Pendarovski", Continent.EUROPE);
		CountryDTO countryDTO128 = new CountryDTO("NORWAY", Code.NOR, 5421241L, "Erna Solberg", Continent.EUROPE);
		CountryDTO countryDTO129 = new CountryDTO("OMAN", Code.OMN, 5106626L, "Haitham bin Tariq", Continent.ASIA);
		CountryDTO countryDTO130 = new CountryDTO("PAKISTAN", Code.PAK, 220892340L, "Arif Alvi", Continent.ASIA);
		CountryDTO countryDTO131 = new CountryDTO("PALAU", Code.PLW, 18094L, "Surangel Whipps Jr.", Continent.OCEANIA);
		CountryDTO countryDTO132 = new CountryDTO("PALESTINE", Code.PLW, 5101414L, "Mahmoud Abbas", Continent.ASIA);
		CountryDTO countryDTO133 = new CountryDTO("PANAMA", Code.PAN, 4314767L, "Laurentino Cortizo", Continent.NORTHAMERICA);
		CountryDTO countryDTO134 = new CountryDTO("PAPUA NEW GUINEA", Code.PNG, 8947027L, "James Marape", Continent.OCEANIA);
		CountryDTO countryDTO135 = new CountryDTO("PARAGUAY", Code.PRY, 7132538L, "Mario Abdo Benítez", Continent.SOUTHAMERICA);
		CountryDTO countryDTO136 = new CountryDTO("PERU", Code.PER, 32971854L, "Francisco Sagasti", Continent.SOUTHAMERICA);
		CountryDTO countryDTO137 = new CountryDTO("PHILIPPINES", Code.PHL, 109581078L, "Rodrigo Duterte", Continent.ASIA);
		CountryDTO countryDTO138 = new CountryDTO("POLAND", Code.POL, 38386000L, "Andrzej Duda", Continent.EUROPE);
		CountryDTO countryDTO139 = new CountryDTO("PORTUGAL", Code.PRT, 10196709L, "Marcelo Rebelo de Sousa", Continent.EUROPE);
		CountryDTO countryDTO140 = new CountryDTO("QATAR", Code.QAT, 2881053L, "Tamim bin Hamad Al Thani", Continent.ASIA);
		CountryDTO countryDTO141 = new CountryDTO("ROMANIA", Code.ROM, 19237691L, "Klaus Iohannis", Continent.EUROPE);
		CountryDTO countryDTO142 = new CountryDTO("RUSSIA", Code.RUS, 145912025L, "Vladimir Putin", Continent.EUROPE);
		CountryDTO countryDTO143 = new CountryDTO("RWANDA", Code.RWA, 12952218L, "Paul Kagame", Continent.AFRICA);
		CountryDTO countryDTO144 = new CountryDTO("SAINT KITTS AND NEVIS", Code.KNA, 53199L, "Timothy Harris", Continent.NORTHAMERICA);
		CountryDTO countryDTO145 = new CountryDTO("SAINT LUCIA", Code.LCA, 183627L, "Philip J. Pierre", Continent.NORTHAMERICA);
		CountryDTO countryDTO146 = new CountryDTO("SAINT VINCENT AND THE GRENADINES", Code.VCT, 110940L, "Ralph Gonsalves", Continent.NORTHAMERICA);
		CountryDTO countryDTO147 = new CountryDTO("SAMOA", Code.WSM, 198410L, "Naomi Mataʻafa", Continent.OCEANIA);
		CountryDTO countryDTO148 = new CountryDTO("SAN MARINO", Code.SMR, 33931L, "Gian Carlo Venturini", Continent.EUROPE);
		CountryDTO countryDTO149 = new CountryDTO("SAO TOME AND PRINCIPE", Code.STP, 219159L, "Evaristo Carvalho", Continent.AFRICA);
		CountryDTO countryDTO150 = new CountryDTO("SAUDI ARABIA", Code.SAU, 34813871L, "Salman bin Abdulaziz Al Saud", Continent.ASIA);
		CountryDTO countryDTO151 = new CountryDTO("SENEGAL", Code.SEN, 16743927L, "Macky Sall", Continent.AFRICA);
		CountryDTO countryDTO152 = new CountryDTO("SERBIA", Code.SER, 8772235L, "Aleksandar Vučić", Continent.EUROPE);
		CountryDTO countryDTO153 = new CountryDTO("SEYCHELLES", Code.SYC, 98347L, "Wavel Ramkalawan", Continent.AFRICA);
		CountryDTO countryDTO154 = new CountryDTO("SIERRA LEONE", Code.SLE, 7976983L, "Julius Maada Bio", Continent.AFRICA);
		CountryDTO countryDTO155 = new CountryDTO("SINGAPORE", Code.SGP, 5850342L, "Halimah Yacob", Continent.ASIA);
		CountryDTO countryDTO156 = new CountryDTO("SLOVAKIA", Code.SVK, 5456362L, "Zuzana Čaputová", Continent.EUROPE);
		CountryDTO countryDTO157 = new CountryDTO("SLOVENIA", Code.SVN, 2078654L, "Borut Pahor", Continent.EUROPE);
		CountryDTO countryDTO158 = new CountryDTO("SOLOMON ISLANDS", Code.SLB, 686884L, "Manasseh Sogavare", Continent.OCEANIA);
		CountryDTO countryDTO159 = new CountryDTO("SOMALIA", Code.SOM, 15893222L, "Mohamed Abdullahi Mohamed", Continent.AFRICA);
		CountryDTO countryDTO160 = new CountryDTO("SOUTH AFRICA", Code.ZAF, 59308690L, "Cyril Ramaphosa", Continent.AFRICA);
		CountryDTO countryDTO161 = new CountryDTO("SOUTH KOREA", Code.KOR, 51269185L, "Moon Jae-in", Continent.ASIA);
		CountryDTO countryDTO162 = new CountryDTO("SOUTH SUDAN", Code.SAU, 11193725L, "Salva Kiir Mayardit", Continent.AFRICA);
		CountryDTO countryDTO163 = new CountryDTO("SPAIN", Code.ESP, 46754778L, "Pedro Sánchez", Continent.EUROPE);
		CountryDTO countryDTO164 = new CountryDTO("SRI LANKA", Code.LKA, 21413249L, "Gotabaya Rajapaksa", Continent.ASIA);
		CountryDTO countryDTO165 = new CountryDTO("SUDAN", Code.SDN, 43849260L, "Abdalla Hamdok", Continent.AFRICA);
		CountryDTO countryDTO166 = new CountryDTO("SURINAME", Code.SUR, 586632L, "Chandrikapersad Santokhi", Continent.SOUTHAMERICA);
		CountryDTO countryDTO167 = new CountryDTO("SWEDEN", Code.SWE, 10353442L, "Stefan Löfven", Continent.EUROPE);
		CountryDTO countryDTO168 = new CountryDTO("SWITZERLAND", Code.CHE, 8654622L, "Guy Parmelin", Continent.EUROPE);
		CountryDTO countryDTO169 = new CountryDTO("SYRIA", Code.SYR, 17500658L, "Bashar al-Assad", Continent.ASIA);
		CountryDTO countryDTO170 = new CountryDTO("TAIWAN", Code.TWN, 23816775L, "Tsai Ing-wen", Continent.ASIA);
		CountryDTO countryDTO171 = new CountryDTO("TAJIKISTAN", Code.TJK, 9537645L, "Emomali Rahmon", Continent.ASIA);
		CountryDTO countryDTO172 = new CountryDTO("TANZANIA", Code.TZA, 59734218L, "Samia Suluhu Hassan", Continent.AFRICA);
		CountryDTO countryDTO173 = new CountryDTO("THAILAND", Code.THA, 69799978L, "Prayut Chan-o-cha", Continent.ASIA);
		CountryDTO countryDTO174 = new CountryDTO("TIMOR-LESTE", Code.TKL, 1318445L, "Francisco Guterres", Continent.ASIA);
		CountryDTO countryDTO175 = new CountryDTO("TOGO", Code.TGO, 8278724L, "Faure Gnassingbé", Continent.AFRICA);
		CountryDTO countryDTO176 = new CountryDTO("TONGA", Code.TON, 105695L, "Tupou VI", Continent.OCEANIA);
		CountryDTO countryDTO177 = new CountryDTO("TRINIDAD AND TOBAGO", Code.TTO, 1399488L, "Paula-Mae Weekes", Continent.NORTHAMERICA);
		CountryDTO countryDTO178 = new CountryDTO("TUNISIA", Code.TUN, 11818618L, "Kais Saied", Continent.AFRICA);
		CountryDTO countryDTO179 = new CountryDTO("TURKEY", Code.TUR, 84339067L, "Recep Tayyip Erdoğan", Continent.ASIA);
		CountryDTO countryDTO180 = new CountryDTO("TURKMENISTAN", Code.TKM, 6031187L, "Gurbanguly Berdimuhamedow", Continent.ASIA);
		CountryDTO countryDTO181 = new CountryDTO("TUVALU", Code.TUV, 11792L, "Kausea Natano", Continent.OCEANIA);
		CountryDTO countryDTO182 = new CountryDTO("UGANDA", Code.UGA, 45741007L, "Yoweri Museveni", Continent.AFRICA);
		CountryDTO countryDTO183 = new CountryDTO("UKRAINE", Code.UKR, 44134693L, "Volodymyr Zelensky", Continent.EUROPE);
		CountryDTO countryDTO184 = new CountryDTO("UNITED ARAB EMIRATES", Code.ARE, 9890402L, "Khalifa bin Zayed Al Nahyan", Continent.ASIA);
		CountryDTO countryDTO185 = new CountryDTO("UNITED KINGDOM", Code.GBR, 67886011L, "Queen Elizabeth II", Continent.EUROPE);
		CountryDTO countryDTO186 = new CountryDTO("UNITED STATES", Code.USA, 331002651L, "Joe Biden", Continent.NORTHAMERICA);
		CountryDTO countryDTO187 = new CountryDTO("URUGUAY", Code.URY, 3473730L, "Luis Lacalle Pou", Continent.SOUTHAMERICA);
		CountryDTO countryDTO188 = new CountryDTO("UZBEKISTAN", Code.UZB, 33469203L, "Shavkat Mirziyoyev", Continent.ASIA);
		CountryDTO countryDTO189 = new CountryDTO("VANUATU", Code.VUT, 307150L, "Tallus Stephen", Continent.OCEANIA);
		CountryDTO countryDTO190 = new CountryDTO("VATICAN CITY", Code.VAT, 801L, "Pope Francis", Continent.EUROPE);
		CountryDTO countryDTO191 = new CountryDTO("VENEZUELA", Code.VEN, 28435940L, "Nicolás Maduro", Continent.SOUTHAMERICA);
		CountryDTO countryDTO192 = new CountryDTO("VIETNAM", Code.VNM, 97338579L, "Nguyễn Phú Trọng", Continent.ASIA);
		CountryDTO countryDTO193 = new CountryDTO("YEMEN", Code.YEM, 29825964L, "Abdrabbuh Mansur Hadi", Continent.ASIA);
		CountryDTO countryDTO194 = new CountryDTO("ZAMBIA", Code.ZMB, 18383955L, "Edgar Lungu", Continent.AFRICA);
		CountryDTO countryDTO195 = new CountryDTO("ZIMBABWE", Code.ZWE, 14862924L, "Emmerson Mnangagwa", Continent.AFRICA);


		Collection<CountryDTO> collection = new LinkedList<CountryDTO>();
		
		collection.add(countryDTO1);
		collection.add(countryDTO2);
		collection.add(countryDTO3);
		collection.add(countryDTO4);
		collection.add(countryDTO5);
		collection.add(countryDTO6);
		collection.add(countryDTO7);
		collection.add(countryDTO8);
		collection.add(countryDTO9);
		collection.add(countryDTO10);
		
		collection.add(countryDTO11);
		collection.add(countryDTO12);
		collection.add(countryDTO13);
		collection.add(countryDTO14);
		collection.add(countryDTO15);
		collection.add(countryDTO16);
		collection.add(countryDTO17);
		collection.add(countryDTO18);
		collection.add(countryDTO19);
		collection.add(countryDTO20);
		
		collection.add(countryDTO21);
		collection.add(countryDTO22);
		collection.add(countryDTO23);
		collection.add(countryDTO24);
		collection.add(countryDTO25);
		collection.add(countryDTO26);
		collection.add(countryDTO27);
		collection.add(countryDTO28);
		collection.add(countryDTO29);
		collection.add(countryDTO30);

		collection.add(countryDTO30);
		collection.add(countryDTO31);
		collection.add(countryDTO32);
		collection.add(countryDTO33);
		collection.add(countryDTO34);
		collection.add(countryDTO35);
		collection.add(countryDTO36);
		collection.add(countryDTO37);
		collection.add(countryDTO38);
		collection.add(countryDTO39);
		collection.add(countryDTO40);

		collection.add(countryDTO41);
		collection.add(countryDTO42);
		collection.add(countryDTO43);
		collection.add(countryDTO44);
		collection.add(countryDTO45);
		collection.add(countryDTO46);
		collection.add(countryDTO47);
		collection.add(countryDTO48);
		collection.add(countryDTO49);
		collection.add(countryDTO50);

		collection.add(countryDTO51);
		collection.add(countryDTO52);
		collection.add(countryDTO53);
		collection.add(countryDTO54);
		collection.add(countryDTO55);
		collection.add(countryDTO56);
		collection.add(countryDTO57);
		collection.add(countryDTO58);
		collection.add(countryDTO59);
		collection.add(countryDTO60);

		collection.add(countryDTO61);
		collection.add(countryDTO62);
		collection.add(countryDTO63);
		collection.add(countryDTO64);
		collection.add(countryDTO65);
		collection.add(countryDTO66);
		collection.add(countryDTO67);
		collection.add(countryDTO68);
		collection.add(countryDTO69);
		collection.add(countryDTO70);

		collection.add(countryDTO71);
		collection.add(countryDTO72);
		collection.add(countryDTO73);
		collection.add(countryDTO74);
		collection.add(countryDTO75);
		collection.add(countryDTO76);
		collection.add(countryDTO77);
		collection.add(countryDTO78);
		collection.add(countryDTO79);
		collection.add(countryDTO80);

		collection.add(countryDTO81);
		collection.add(countryDTO82);
		collection.add(countryDTO83);
		collection.add(countryDTO84);
		collection.add(countryDTO85);
		collection.add(countryDTO86);
		collection.add(countryDTO87);
		collection.add(countryDTO88);
		collection.add(countryDTO89);
		collection.add(countryDTO90);
		
		collection.add(countryDTO91);
		collection.add(countryDTO92);
		collection.add(countryDTO93);
		collection.add(countryDTO94);
		collection.add(countryDTO95);
		collection.add(countryDTO96);
		collection.add(countryDTO97);
		collection.add(countryDTO98);
		collection.add(countryDTO99);
		collection.add(countryDTO100);

		collection.add(countryDTO101);
		collection.add(countryDTO102);
		collection.add(countryDTO103);
		collection.add(countryDTO104);
		collection.add(countryDTO105);
		collection.add(countryDTO106);
		collection.add(countryDTO107);
		collection.add(countryDTO108);
		collection.add(countryDTO109);
		collection.add(countryDTO110);
		
		collection.add(countryDTO111);
		collection.add(countryDTO112);
		collection.add(countryDTO113);
		collection.add(countryDTO114);
		collection.add(countryDTO115);
		collection.add(countryDTO116);
		collection.add(countryDTO117);
		collection.add(countryDTO118);
		collection.add(countryDTO119);
		collection.add(countryDTO120);

		collection.add(countryDTO121);
		collection.add(countryDTO122);
		collection.add(countryDTO123);
		collection.add(countryDTO124);
		collection.add(countryDTO125);
		collection.add(countryDTO126);
		collection.add(countryDTO127);
		collection.add(countryDTO128);
		collection.add(countryDTO129);
		collection.add(countryDTO130);
		
		collection.add(countryDTO131);
		collection.add(countryDTO132);
		collection.add(countryDTO133);
		collection.add(countryDTO134);
		collection.add(countryDTO135);
		collection.add(countryDTO136);
		collection.add(countryDTO137);
		collection.add(countryDTO138);
		collection.add(countryDTO139);
		collection.add(countryDTO140);

		collection.add(countryDTO141);
		collection.add(countryDTO142);
		collection.add(countryDTO143);
		collection.add(countryDTO144);
		collection.add(countryDTO145);
		collection.add(countryDTO146);
		collection.add(countryDTO147);
		collection.add(countryDTO148);
		collection.add(countryDTO149);
		collection.add(countryDTO150);
		
		collection.add(countryDTO151);
		collection.add(countryDTO152);
		collection.add(countryDTO153);
		collection.add(countryDTO154);
		collection.add(countryDTO155);
		collection.add(countryDTO156);
		collection.add(countryDTO157);
		collection.add(countryDTO158);
		collection.add(countryDTO159);
		collection.add(countryDTO160);
		
		collection.add(countryDTO161);
		collection.add(countryDTO162);
		collection.add(countryDTO163);
		collection.add(countryDTO164);
		collection.add(countryDTO165);
		collection.add(countryDTO166);
		collection.add(countryDTO167);
		collection.add(countryDTO168);
		collection.add(countryDTO169);
		collection.add(countryDTO170);
		
		collection.add(countryDTO171);
		collection.add(countryDTO172);
		collection.add(countryDTO173);
		collection.add(countryDTO174);
		collection.add(countryDTO175);
		collection.add(countryDTO176);
		collection.add(countryDTO177);
		collection.add(countryDTO178);
		collection.add(countryDTO179);
		collection.add(countryDTO180);
		
		collection.add(countryDTO181);
		collection.add(countryDTO182);
		collection.add(countryDTO183);
		collection.add(countryDTO184);
		collection.add(countryDTO185);
		collection.add(countryDTO186);
		collection.add(countryDTO187);
		collection.add(countryDTO188);
		collection.add(countryDTO189);
		collection.add(countryDTO190);
		
		collection.add(countryDTO191);
		collection.add(countryDTO192);
		collection.add(countryDTO193);
		collection.add(countryDTO194);
		collection.add(countryDTO195);


		Iterator<CountryDTO> iterator = collection.iterator();

        while (iterator.hasNext())
        {
            CountryDTO country = iterator.next();
            if (country.getPopulation() > 250000000L) 
            {
                System.out.println("Country names who's population is > 250000000L:" +country.getName());
            }

        }
        System.out.println();

        
		Iterator<CountryDTO> iterator1 = collection.iterator();

        while (iterator1.hasNext()) 
        {
            CountryDTO country = iterator1.next();
            System.out.println(country.getName() + ":" + country.getPresidentName());
        }
        
		Iterator<CountryDTO> iterator2 = collection.iterator();

        while (iterator2.hasNext())
        {
            CountryDTO country = iterator2.next();
            if (country.getCode().ordinal() < 50) {
                System.out.println(country.getName() + ": " + country.getCode().getCodeValue());
            }
        }
        
        Iterator<CountryDTO> iterator3 = collection.iterator();
        while (iterator3.hasNext()) 
        {
            CountryDTO country = iterator3.next();
            if (country.getCode().ordinal() < 50 && country.getName().startsWith("A")) 
            {
                System.out.println(country.getName() + ": " + country.getCode().getCodeValue());
            }
        }
        
        Iterator<CountryDTO> iterator4 = collection.iterator();
        while (iterator4.hasNext()) 
        {
            CountryDTO country = iterator4.next();
            if (country.getName().contains("I")) 
            {
            	System.out.println(country.getName());
				
			}		
		}

     }
}
