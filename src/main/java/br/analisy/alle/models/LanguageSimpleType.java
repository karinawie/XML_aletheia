//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2020.10.14 às 04:57:57 PM BRT 
//


package br.analisy.alle.models;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de LanguageSimpleType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Abkhaz"/>
 *     &lt;enumeration value="Afar"/>
 *     &lt;enumeration value="Afrikaans"/>
 *     &lt;enumeration value="Akan"/>
 *     &lt;enumeration value="Albanian"/>
 *     &lt;enumeration value="Amharic"/>
 *     &lt;enumeration value="Arabic"/>
 *     &lt;enumeration value="Aragonese"/>
 *     &lt;enumeration value="Armenian"/>
 *     &lt;enumeration value="Assamese"/>
 *     &lt;enumeration value="Avaric"/>
 *     &lt;enumeration value="Avestan"/>
 *     &lt;enumeration value="Aymara"/>
 *     &lt;enumeration value="Azerbaijani"/>
 *     &lt;enumeration value="Bambara"/>
 *     &lt;enumeration value="Bashkir"/>
 *     &lt;enumeration value="Basque"/>
 *     &lt;enumeration value="Belarusian"/>
 *     &lt;enumeration value="Bengali"/>
 *     &lt;enumeration value="Bihari"/>
 *     &lt;enumeration value="Bislama"/>
 *     &lt;enumeration value="Bosnian"/>
 *     &lt;enumeration value="Breton"/>
 *     &lt;enumeration value="Bulgarian"/>
 *     &lt;enumeration value="Burmese"/>
 *     &lt;enumeration value="Cambodian"/>
 *     &lt;enumeration value="Cantonese"/>
 *     &lt;enumeration value="Catalan"/>
 *     &lt;enumeration value="Chamorro"/>
 *     &lt;enumeration value="Chechen"/>
 *     &lt;enumeration value="Chichewa"/>
 *     &lt;enumeration value="Chinese"/>
 *     &lt;enumeration value="Chuvash"/>
 *     &lt;enumeration value="Cornish"/>
 *     &lt;enumeration value="Corsican"/>
 *     &lt;enumeration value="Cree"/>
 *     &lt;enumeration value="Croatian"/>
 *     &lt;enumeration value="Czech"/>
 *     &lt;enumeration value="Danish"/>
 *     &lt;enumeration value="Divehi"/>
 *     &lt;enumeration value="Dutch"/>
 *     &lt;enumeration value="Dzongkha"/>
 *     &lt;enumeration value="English"/>
 *     &lt;enumeration value="Esperanto"/>
 *     &lt;enumeration value="Estonian"/>
 *     &lt;enumeration value="Ewe"/>
 *     &lt;enumeration value="Faroese"/>
 *     &lt;enumeration value="Fijian"/>
 *     &lt;enumeration value="Finnish"/>
 *     &lt;enumeration value="French"/>
 *     &lt;enumeration value="Fula"/>
 *     &lt;enumeration value="Gaelic"/>
 *     &lt;enumeration value="Galician"/>
 *     &lt;enumeration value="Ganda"/>
 *     &lt;enumeration value="Georgian"/>
 *     &lt;enumeration value="German"/>
 *     &lt;enumeration value="Greek"/>
 *     &lt;enumeration value="Guaraní"/>
 *     &lt;enumeration value="Gujarati"/>
 *     &lt;enumeration value="Haitian"/>
 *     &lt;enumeration value="Hausa"/>
 *     &lt;enumeration value="Hebrew"/>
 *     &lt;enumeration value="Herero"/>
 *     &lt;enumeration value="Hindi"/>
 *     &lt;enumeration value="Hiri Motu"/>
 *     &lt;enumeration value="Hungarian"/>
 *     &lt;enumeration value="Icelandic"/>
 *     &lt;enumeration value="Ido"/>
 *     &lt;enumeration value="Igbo"/>
 *     &lt;enumeration value="Indonesian"/>
 *     &lt;enumeration value="Interlingua"/>
 *     &lt;enumeration value="Interlingue"/>
 *     &lt;enumeration value="Inuktitut"/>
 *     &lt;enumeration value="Inupiaq"/>
 *     &lt;enumeration value="Irish"/>
 *     &lt;enumeration value="Italian"/>
 *     &lt;enumeration value="Japanese"/>
 *     &lt;enumeration value="Javanese"/>
 *     &lt;enumeration value="Kalaallisut"/>
 *     &lt;enumeration value="Kannada"/>
 *     &lt;enumeration value="Kanuri"/>
 *     &lt;enumeration value="Kashmiri"/>
 *     &lt;enumeration value="Kazakh"/>
 *     &lt;enumeration value="Khmer"/>
 *     &lt;enumeration value="Kikuyu"/>
 *     &lt;enumeration value="Kinyarwanda"/>
 *     &lt;enumeration value="Kirundi"/>
 *     &lt;enumeration value="Komi"/>
 *     &lt;enumeration value="Kongo"/>
 *     &lt;enumeration value="Korean"/>
 *     &lt;enumeration value="Kurdish"/>
 *     &lt;enumeration value="Kwanyama"/>
 *     &lt;enumeration value="Kyrgyz"/>
 *     &lt;enumeration value="Lao"/>
 *     &lt;enumeration value="Latin"/>
 *     &lt;enumeration value="Latvian"/>
 *     &lt;enumeration value="Limburgish"/>
 *     &lt;enumeration value="Lingala"/>
 *     &lt;enumeration value="Lithuanian"/>
 *     &lt;enumeration value="Luba-Katanga"/>
 *     &lt;enumeration value="Luxembourgish"/>
 *     &lt;enumeration value="Macedonian"/>
 *     &lt;enumeration value="Malagasy"/>
 *     &lt;enumeration value="Malay"/>
 *     &lt;enumeration value="Malayalam"/>
 *     &lt;enumeration value="Maltese"/>
 *     &lt;enumeration value="Manx"/>
 *     &lt;enumeration value="Māori"/>
 *     &lt;enumeration value="Marathi"/>
 *     &lt;enumeration value="Marshallese"/>
 *     &lt;enumeration value="Mongolian"/>
 *     &lt;enumeration value="Nauru"/>
 *     &lt;enumeration value="Navajo"/>
 *     &lt;enumeration value="Ndonga"/>
 *     &lt;enumeration value="Nepali"/>
 *     &lt;enumeration value="North Ndebele"/>
 *     &lt;enumeration value="Northern Sami"/>
 *     &lt;enumeration value="Norwegian"/>
 *     &lt;enumeration value="Norwegian Bokmål"/>
 *     &lt;enumeration value="Norwegian Nynorsk"/>
 *     &lt;enumeration value="Nuosu"/>
 *     &lt;enumeration value="Occitan"/>
 *     &lt;enumeration value="Ojibwe"/>
 *     &lt;enumeration value="Old Church Slavonic"/>
 *     &lt;enumeration value="Oriya"/>
 *     &lt;enumeration value="Oromo"/>
 *     &lt;enumeration value="Ossetian"/>
 *     &lt;enumeration value="Pāli"/>
 *     &lt;enumeration value="Panjabi"/>
 *     &lt;enumeration value="Pashto"/>
 *     &lt;enumeration value="Persian"/>
 *     &lt;enumeration value="Polish"/>
 *     &lt;enumeration value="Portuguese"/>
 *     &lt;enumeration value="Punjabi"/>
 *     &lt;enumeration value="Quechua"/>
 *     &lt;enumeration value="Romanian"/>
 *     &lt;enumeration value="Romansh"/>
 *     &lt;enumeration value="Russian"/>
 *     &lt;enumeration value="Samoan"/>
 *     &lt;enumeration value="Sango"/>
 *     &lt;enumeration value="Sanskrit"/>
 *     &lt;enumeration value="Sardinian"/>
 *     &lt;enumeration value="Serbian"/>
 *     &lt;enumeration value="Shona"/>
 *     &lt;enumeration value="Sindhi"/>
 *     &lt;enumeration value="Sinhala"/>
 *     &lt;enumeration value="Slovak"/>
 *     &lt;enumeration value="Slovene"/>
 *     &lt;enumeration value="Somali"/>
 *     &lt;enumeration value="South Ndebele"/>
 *     &lt;enumeration value="Southern Sotho"/>
 *     &lt;enumeration value="Spanish"/>
 *     &lt;enumeration value="Sundanese"/>
 *     &lt;enumeration value="Swahili"/>
 *     &lt;enumeration value="Swati"/>
 *     &lt;enumeration value="Swedish"/>
 *     &lt;enumeration value="Tagalog"/>
 *     &lt;enumeration value="Tahitian"/>
 *     &lt;enumeration value="Tajik"/>
 *     &lt;enumeration value="Tamil"/>
 *     &lt;enumeration value="Tatar"/>
 *     &lt;enumeration value="Telugu"/>
 *     &lt;enumeration value="Thai"/>
 *     &lt;enumeration value="Tibetan"/>
 *     &lt;enumeration value="Tigrinya"/>
 *     &lt;enumeration value="Tonga"/>
 *     &lt;enumeration value="Tsonga"/>
 *     &lt;enumeration value="Tswana"/>
 *     &lt;enumeration value="Turkish"/>
 *     &lt;enumeration value="Turkmen"/>
 *     &lt;enumeration value="Twi"/>
 *     &lt;enumeration value="Uighur"/>
 *     &lt;enumeration value="Ukrainian"/>
 *     &lt;enumeration value="Urdu"/>
 *     &lt;enumeration value="Uzbek"/>
 *     &lt;enumeration value="Venda"/>
 *     &lt;enumeration value="Vietnamese"/>
 *     &lt;enumeration value="Volapük"/>
 *     &lt;enumeration value="Walloon"/>
 *     &lt;enumeration value="Welsh"/>
 *     &lt;enumeration value="Western Frisian"/>
 *     &lt;enumeration value="Wolof"/>
 *     &lt;enumeration value="Xhosa"/>
 *     &lt;enumeration value="Yiddish"/>
 *     &lt;enumeration value="Yoruba"/>
 *     &lt;enumeration value="Zhuang"/>
 *     &lt;enumeration value="Zulu"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LanguageSimpleType")
@XmlEnum
public enum LanguageSimpleType {

    @XmlEnumValue("Abkhaz")
    ABKHAZ("Abkhaz"),
    @XmlEnumValue("Afar")
    AFAR("Afar"),
    @XmlEnumValue("Afrikaans")
    AFRIKAANS("Afrikaans"),
    @XmlEnumValue("Akan")
    AKAN("Akan"),
    @XmlEnumValue("Albanian")
    ALBANIAN("Albanian"),
    @XmlEnumValue("Amharic")
    AMHARIC("Amharic"),
    @XmlEnumValue("Arabic")
    ARABIC("Arabic"),
    @XmlEnumValue("Aragonese")
    ARAGONESE("Aragonese"),
    @XmlEnumValue("Armenian")
    ARMENIAN("Armenian"),
    @XmlEnumValue("Assamese")
    ASSAMESE("Assamese"),
    @XmlEnumValue("Avaric")
    AVARIC("Avaric"),
    @XmlEnumValue("Avestan")
    AVESTAN("Avestan"),
    @XmlEnumValue("Aymara")
    AYMARA("Aymara"),
    @XmlEnumValue("Azerbaijani")
    AZERBAIJANI("Azerbaijani"),
    @XmlEnumValue("Bambara")
    BAMBARA("Bambara"),
    @XmlEnumValue("Bashkir")
    BASHKIR("Bashkir"),
    @XmlEnumValue("Basque")
    BASQUE("Basque"),
    @XmlEnumValue("Belarusian")
    BELARUSIAN("Belarusian"),
    @XmlEnumValue("Bengali")
    BENGALI("Bengali"),
    @XmlEnumValue("Bihari")
    BIHARI("Bihari"),
    @XmlEnumValue("Bislama")
    BISLAMA("Bislama"),
    @XmlEnumValue("Bosnian")
    BOSNIAN("Bosnian"),
    @XmlEnumValue("Breton")
    BRETON("Breton"),
    @XmlEnumValue("Bulgarian")
    BULGARIAN("Bulgarian"),
    @XmlEnumValue("Burmese")
    BURMESE("Burmese"),
    @XmlEnumValue("Cambodian")
    CAMBODIAN("Cambodian"),
    @XmlEnumValue("Cantonese")
    CANTONESE("Cantonese"),
    @XmlEnumValue("Catalan")
    CATALAN("Catalan"),
    @XmlEnumValue("Chamorro")
    CHAMORRO("Chamorro"),
    @XmlEnumValue("Chechen")
    CHECHEN("Chechen"),
    @XmlEnumValue("Chichewa")
    CHICHEWA("Chichewa"),
    @XmlEnumValue("Chinese")
    CHINESE("Chinese"),
    @XmlEnumValue("Chuvash")
    CHUVASH("Chuvash"),
    @XmlEnumValue("Cornish")
    CORNISH("Cornish"),
    @XmlEnumValue("Corsican")
    CORSICAN("Corsican"),
    @XmlEnumValue("Cree")
    CREE("Cree"),
    @XmlEnumValue("Croatian")
    CROATIAN("Croatian"),
    @XmlEnumValue("Czech")
    CZECH("Czech"),
    @XmlEnumValue("Danish")
    DANISH("Danish"),
    @XmlEnumValue("Divehi")
    DIVEHI("Divehi"),
    @XmlEnumValue("Dutch")
    DUTCH("Dutch"),
    @XmlEnumValue("Dzongkha")
    DZONGKHA("Dzongkha"),
    @XmlEnumValue("English")
    ENGLISH("English"),
    @XmlEnumValue("Esperanto")
    ESPERANTO("Esperanto"),
    @XmlEnumValue("Estonian")
    ESTONIAN("Estonian"),
    @XmlEnumValue("Ewe")
    EWE("Ewe"),
    @XmlEnumValue("Faroese")
    FAROESE("Faroese"),
    @XmlEnumValue("Fijian")
    FIJIAN("Fijian"),
    @XmlEnumValue("Finnish")
    FINNISH("Finnish"),
    @XmlEnumValue("French")
    FRENCH("French"),
    @XmlEnumValue("Fula")
    FULA("Fula"),
    @XmlEnumValue("Gaelic")
    GAELIC("Gaelic"),
    @XmlEnumValue("Galician")
    GALICIAN("Galician"),
    @XmlEnumValue("Ganda")
    GANDA("Ganda"),
    @XmlEnumValue("Georgian")
    GEORGIAN("Georgian"),
    @XmlEnumValue("German")
    GERMAN("German"),
    @XmlEnumValue("Greek")
    GREEK("Greek"),
    @XmlEnumValue("Guaran\u00ed")
    GUARANÍ("Guaran\u00ed"),
    @XmlEnumValue("Gujarati")
    GUJARATI("Gujarati"),
    @XmlEnumValue("Haitian")
    HAITIAN("Haitian"),
    @XmlEnumValue("Hausa")
    HAUSA("Hausa"),
    @XmlEnumValue("Hebrew")
    HEBREW("Hebrew"),
    @XmlEnumValue("Herero")
    HERERO("Herero"),
    @XmlEnumValue("Hindi")
    HINDI("Hindi"),
    @XmlEnumValue("Hiri Motu")
    HIRI_MOTU("Hiri Motu"),
    @XmlEnumValue("Hungarian")
    HUNGARIAN("Hungarian"),
    @XmlEnumValue("Icelandic")
    ICELANDIC("Icelandic"),
    @XmlEnumValue("Ido")
    IDO("Ido"),
    @XmlEnumValue("Igbo")
    IGBO("Igbo"),
    @XmlEnumValue("Indonesian")
    INDONESIAN("Indonesian"),
    @XmlEnumValue("Interlingua")
    INTERLINGUA("Interlingua"),
    @XmlEnumValue("Interlingue")
    INTERLINGUE("Interlingue"),
    @XmlEnumValue("Inuktitut")
    INUKTITUT("Inuktitut"),
    @XmlEnumValue("Inupiaq")
    INUPIAQ("Inupiaq"),
    @XmlEnumValue("Irish")
    IRISH("Irish"),
    @XmlEnumValue("Italian")
    ITALIAN("Italian"),
    @XmlEnumValue("Japanese")
    JAPANESE("Japanese"),
    @XmlEnumValue("Javanese")
    JAVANESE("Javanese"),
    @XmlEnumValue("Kalaallisut")
    KALAALLISUT("Kalaallisut"),
    @XmlEnumValue("Kannada")
    KANNADA("Kannada"),
    @XmlEnumValue("Kanuri")
    KANURI("Kanuri"),
    @XmlEnumValue("Kashmiri")
    KASHMIRI("Kashmiri"),
    @XmlEnumValue("Kazakh")
    KAZAKH("Kazakh"),
    @XmlEnumValue("Khmer")
    KHMER("Khmer"),
    @XmlEnumValue("Kikuyu")
    KIKUYU("Kikuyu"),
    @XmlEnumValue("Kinyarwanda")
    KINYARWANDA("Kinyarwanda"),
    @XmlEnumValue("Kirundi")
    KIRUNDI("Kirundi"),
    @XmlEnumValue("Komi")
    KOMI("Komi"),
    @XmlEnumValue("Kongo")
    KONGO("Kongo"),
    @XmlEnumValue("Korean")
    KOREAN("Korean"),
    @XmlEnumValue("Kurdish")
    KURDISH("Kurdish"),
    @XmlEnumValue("Kwanyama")
    KWANYAMA("Kwanyama"),
    @XmlEnumValue("Kyrgyz")
    KYRGYZ("Kyrgyz"),
    @XmlEnumValue("Lao")
    LAO("Lao"),
    @XmlEnumValue("Latin")
    LATIN("Latin"),
    @XmlEnumValue("Latvian")
    LATVIAN("Latvian"),
    @XmlEnumValue("Limburgish")
    LIMBURGISH("Limburgish"),
    @XmlEnumValue("Lingala")
    LINGALA("Lingala"),
    @XmlEnumValue("Lithuanian")
    LITHUANIAN("Lithuanian"),
    @XmlEnumValue("Luba-Katanga")
    LUBA_KATANGA("Luba-Katanga"),
    @XmlEnumValue("Luxembourgish")
    LUXEMBOURGISH("Luxembourgish"),
    @XmlEnumValue("Macedonian")
    MACEDONIAN("Macedonian"),
    @XmlEnumValue("Malagasy")
    MALAGASY("Malagasy"),
    @XmlEnumValue("Malay")
    MALAY("Malay"),
    @XmlEnumValue("Malayalam")
    MALAYALAM("Malayalam"),
    @XmlEnumValue("Maltese")
    MALTESE("Maltese"),
    @XmlEnumValue("Manx")
    MANX("Manx"),
    @XmlEnumValue("M\u0101ori")
    MĀORI("M\u0101ori"),
    @XmlEnumValue("Marathi")
    MARATHI("Marathi"),
    @XmlEnumValue("Marshallese")
    MARSHALLESE("Marshallese"),
    @XmlEnumValue("Mongolian")
    MONGOLIAN("Mongolian"),
    @XmlEnumValue("Nauru")
    NAURU("Nauru"),
    @XmlEnumValue("Navajo")
    NAVAJO("Navajo"),
    @XmlEnumValue("Ndonga")
    NDONGA("Ndonga"),
    @XmlEnumValue("Nepali")
    NEPALI("Nepali"),
    @XmlEnumValue("North Ndebele")
    NORTH_NDEBELE("North Ndebele"),
    @XmlEnumValue("Northern Sami")
    NORTHERN_SAMI("Northern Sami"),
    @XmlEnumValue("Norwegian")
    NORWEGIAN("Norwegian"),
    @XmlEnumValue("Norwegian Bokm\u00e5l")
    NORWEGIAN_BOKMÅL("Norwegian Bokm\u00e5l"),
    @XmlEnumValue("Norwegian Nynorsk")
    NORWEGIAN_NYNORSK("Norwegian Nynorsk"),
    @XmlEnumValue("Nuosu")
    NUOSU("Nuosu"),
    @XmlEnumValue("Occitan")
    OCCITAN("Occitan"),
    @XmlEnumValue("Ojibwe")
    OJIBWE("Ojibwe"),
    @XmlEnumValue("Old Church Slavonic")
    OLD_CHURCH_SLAVONIC("Old Church Slavonic"),
    @XmlEnumValue("Oriya")
    ORIYA("Oriya"),
    @XmlEnumValue("Oromo")
    OROMO("Oromo"),
    @XmlEnumValue("Ossetian")
    OSSETIAN("Ossetian"),
    @XmlEnumValue("P\u0101li")
    PĀLI("P\u0101li"),
    @XmlEnumValue("Panjabi")
    PANJABI("Panjabi"),
    @XmlEnumValue("Pashto")
    PASHTO("Pashto"),
    @XmlEnumValue("Persian")
    PERSIAN("Persian"),
    @XmlEnumValue("Polish")
    POLISH("Polish"),
    @XmlEnumValue("Portuguese")
    PORTUGUESE("Portuguese"),
    @XmlEnumValue("Punjabi")
    PUNJABI("Punjabi"),
    @XmlEnumValue("Quechua")
    QUECHUA("Quechua"),
    @XmlEnumValue("Romanian")
    ROMANIAN("Romanian"),
    @XmlEnumValue("Romansh")
    ROMANSH("Romansh"),
    @XmlEnumValue("Russian")
    RUSSIAN("Russian"),
    @XmlEnumValue("Samoan")
    SAMOAN("Samoan"),
    @XmlEnumValue("Sango")
    SANGO("Sango"),
    @XmlEnumValue("Sanskrit")
    SANSKRIT("Sanskrit"),
    @XmlEnumValue("Sardinian")
    SARDINIAN("Sardinian"),
    @XmlEnumValue("Serbian")
    SERBIAN("Serbian"),
    @XmlEnumValue("Shona")
    SHONA("Shona"),
    @XmlEnumValue("Sindhi")
    SINDHI("Sindhi"),
    @XmlEnumValue("Sinhala")
    SINHALA("Sinhala"),
    @XmlEnumValue("Slovak")
    SLOVAK("Slovak"),
    @XmlEnumValue("Slovene")
    SLOVENE("Slovene"),
    @XmlEnumValue("Somali")
    SOMALI("Somali"),
    @XmlEnumValue("South Ndebele")
    SOUTH_NDEBELE("South Ndebele"),
    @XmlEnumValue("Southern Sotho")
    SOUTHERN_SOTHO("Southern Sotho"),
    @XmlEnumValue("Spanish")
    SPANISH("Spanish"),
    @XmlEnumValue("Sundanese")
    SUNDANESE("Sundanese"),
    @XmlEnumValue("Swahili")
    SWAHILI("Swahili"),
    @XmlEnumValue("Swati")
    SWATI("Swati"),
    @XmlEnumValue("Swedish")
    SWEDISH("Swedish"),
    @XmlEnumValue("Tagalog")
    TAGALOG("Tagalog"),
    @XmlEnumValue("Tahitian")
    TAHITIAN("Tahitian"),
    @XmlEnumValue("Tajik")
    TAJIK("Tajik"),
    @XmlEnumValue("Tamil")
    TAMIL("Tamil"),
    @XmlEnumValue("Tatar")
    TATAR("Tatar"),
    @XmlEnumValue("Telugu")
    TELUGU("Telugu"),
    @XmlEnumValue("Thai")
    THAI("Thai"),
    @XmlEnumValue("Tibetan")
    TIBETAN("Tibetan"),
    @XmlEnumValue("Tigrinya")
    TIGRINYA("Tigrinya"),
    @XmlEnumValue("Tonga")
    TONGA("Tonga"),
    @XmlEnumValue("Tsonga")
    TSONGA("Tsonga"),
    @XmlEnumValue("Tswana")
    TSWANA("Tswana"),
    @XmlEnumValue("Turkish")
    TURKISH("Turkish"),
    @XmlEnumValue("Turkmen")
    TURKMEN("Turkmen"),
    @XmlEnumValue("Twi")
    TWI("Twi"),
    @XmlEnumValue("Uighur")
    UIGHUR("Uighur"),
    @XmlEnumValue("Ukrainian")
    UKRAINIAN("Ukrainian"),
    @XmlEnumValue("Urdu")
    URDU("Urdu"),
    @XmlEnumValue("Uzbek")
    UZBEK("Uzbek"),
    @XmlEnumValue("Venda")
    VENDA("Venda"),
    @XmlEnumValue("Vietnamese")
    VIETNAMESE("Vietnamese"),
    @XmlEnumValue("Volap\u00fck")
    VOLAPÜK("Volap\u00fck"),
    @XmlEnumValue("Walloon")
    WALLOON("Walloon"),
    @XmlEnumValue("Welsh")
    WELSH("Welsh"),
    @XmlEnumValue("Western Frisian")
    WESTERN_FRISIAN("Western Frisian"),
    @XmlEnumValue("Wolof")
    WOLOF("Wolof"),
    @XmlEnumValue("Xhosa")
    XHOSA("Xhosa"),
    @XmlEnumValue("Yiddish")
    YIDDISH("Yiddish"),
    @XmlEnumValue("Yoruba")
    YORUBA("Yoruba"),
    @XmlEnumValue("Zhuang")
    ZHUANG("Zhuang"),
    @XmlEnumValue("Zulu")
    ZULU("Zulu"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LanguageSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageSimpleType fromValue(String v) {
        for (LanguageSimpleType c: LanguageSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
