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
 * <p>Classe Java de ScriptSimpleType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ScriptSimpleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Adlm - Adlam"/>
 *     &lt;enumeration value="Afak - Afaka"/>
 *     &lt;enumeration value="Aghb - Caucasian Albanian"/>
 *     &lt;enumeration value="Ahom - Ahom, Tai Ahom"/>
 *     &lt;enumeration value="Arab - Arabic"/>
 *     &lt;enumeration value="Aran - Arabic (Nastaliq variant)"/>
 *     &lt;enumeration value="Armi - Imperial Aramaic"/>
 *     &lt;enumeration value="Armn - Armenian"/>
 *     &lt;enumeration value="Avst - Avestan"/>
 *     &lt;enumeration value="Bali - Balinese"/>
 *     &lt;enumeration value="Bamu - Bamum"/>
 *     &lt;enumeration value="Bass - Bassa Vah"/>
 *     &lt;enumeration value="Batk - Batak"/>
 *     &lt;enumeration value="Beng - Bengali"/>
 *     &lt;enumeration value="Bhks - Bhaiksuki"/>
 *     &lt;enumeration value="Blis - Blissymbols"/>
 *     &lt;enumeration value="Bopo - Bopomofo"/>
 *     &lt;enumeration value="Brah - Brahmi"/>
 *     &lt;enumeration value="Brai - Braille"/>
 *     &lt;enumeration value="Bugi - Buginese"/>
 *     &lt;enumeration value="Buhd - Buhid"/>
 *     &lt;enumeration value="Cakm - Chakma"/>
 *     &lt;enumeration value="Cans - Unified Canadian Aboriginal Syllabics"/>
 *     &lt;enumeration value="Cari - Carian"/>
 *     &lt;enumeration value="Cham - Cham"/>
 *     &lt;enumeration value="Cher - Cherokee"/>
 *     &lt;enumeration value="Cirt - Cirth"/>
 *     &lt;enumeration value="Copt - Coptic"/>
 *     &lt;enumeration value="Cprt - Cypriot"/>
 *     &lt;enumeration value="Cyrl - Cyrillic"/>
 *     &lt;enumeration value="Cyrs - Cyrillic (Old Church Slavonic variant)"/>
 *     &lt;enumeration value="Deva - Devanagari (Nagari)"/>
 *     &lt;enumeration value="Dsrt - Deseret (Mormon)"/>
 *     &lt;enumeration value="Dupl - Duployan shorthand, Duployan stenography"/>
 *     &lt;enumeration value="Egyd - Egyptian demotic"/>
 *     &lt;enumeration value="Egyh - Egyptian hieratic"/>
 *     &lt;enumeration value="Egyp - Egyptian hieroglyphs"/>
 *     &lt;enumeration value="Elba - Elbasan"/>
 *     &lt;enumeration value="Ethi - Ethiopic"/>
 *     &lt;enumeration value="Geok - Khutsuri (Asomtavruli and Nuskhuri)"/>
 *     &lt;enumeration value="Geor - Georgian (Mkhedruli)"/>
 *     &lt;enumeration value="Glag - Glagolitic"/>
 *     &lt;enumeration value="Goth - Gothic"/>
 *     &lt;enumeration value="Gran - Grantha"/>
 *     &lt;enumeration value="Grek - Greek"/>
 *     &lt;enumeration value="Gujr - Gujarati"/>
 *     &lt;enumeration value="Guru - Gurmukhi"/>
 *     &lt;enumeration value="Hanb - Han with Bopomofo"/>
 *     &lt;enumeration value="Hang - Hangul"/>
 *     &lt;enumeration value="Hani - Han (Hanzi, Kanji, Hanja)"/>
 *     &lt;enumeration value="Hano - Hanunoo (Hanunóo)"/>
 *     &lt;enumeration value="Hans - Han (Simplified variant)"/>
 *     &lt;enumeration value="Hant - Han (Traditional variant)"/>
 *     &lt;enumeration value="Hatr - Hatran"/>
 *     &lt;enumeration value="Hebr - Hebrew"/>
 *     &lt;enumeration value="Hira - Hiragana"/>
 *     &lt;enumeration value="Hluw - Anatolian Hieroglyphs"/>
 *     &lt;enumeration value="Hmng - Pahawh Hmong"/>
 *     &lt;enumeration value="Hrkt - Japanese syllabaries"/>
 *     &lt;enumeration value="Hung - Old Hungarian (Hungarian Runic)"/>
 *     &lt;enumeration value="Inds - Indus (Harappan)"/>
 *     &lt;enumeration value="Ital - Old Italic (Etruscan, Oscan etc.)"/>
 *     &lt;enumeration value="Jamo - Jamo"/>
 *     &lt;enumeration value="Java - Javanese"/>
 *     &lt;enumeration value="Jpan - Japanese"/>
 *     &lt;enumeration value="Jurc - Jurchen"/>
 *     &lt;enumeration value="Kali - Kayah Li"/>
 *     &lt;enumeration value="Kana - Katakana"/>
 *     &lt;enumeration value="Khar - Kharoshthi"/>
 *     &lt;enumeration value="Khmr - Khmer"/>
 *     &lt;enumeration value="Khoj - Khojki"/>
 *     &lt;enumeration value="Kitl - Khitan large script"/>
 *     &lt;enumeration value="Kits - Khitan small script"/>
 *     &lt;enumeration value="Knda - Kannada"/>
 *     &lt;enumeration value="Kore - Korean (alias for Hangul + Han)"/>
 *     &lt;enumeration value="Kpel - Kpelle"/>
 *     &lt;enumeration value="Kthi - Kaithi"/>
 *     &lt;enumeration value="Lana - Tai Tham (Lanna)"/>
 *     &lt;enumeration value="Laoo - Lao"/>
 *     &lt;enumeration value="Latf - Latin (Fraktur variant)"/>
 *     &lt;enumeration value="Latg - Latin (Gaelic variant)"/>
 *     &lt;enumeration value="Latn - Latin"/>
 *     &lt;enumeration value="Leke - Leke"/>
 *     &lt;enumeration value="Lepc - Lepcha (Róng)"/>
 *     &lt;enumeration value="Limb - Limbu"/>
 *     &lt;enumeration value="Lina - Linear A"/>
 *     &lt;enumeration value="Linb - Linear B"/>
 *     &lt;enumeration value="Lisu - Lisu (Fraser)"/>
 *     &lt;enumeration value="Loma - Loma"/>
 *     &lt;enumeration value="Lyci - Lycian"/>
 *     &lt;enumeration value="Lydi - Lydian"/>
 *     &lt;enumeration value="Mahj - Mahajani"/>
 *     &lt;enumeration value="Mand - Mandaic, Mandaean"/>
 *     &lt;enumeration value="Mani - Manichaean"/>
 *     &lt;enumeration value="Marc - Marchen"/>
 *     &lt;enumeration value="Maya - Mayan hieroglyphs"/>
 *     &lt;enumeration value="Mend - Mende Kikakui"/>
 *     &lt;enumeration value="Merc - Meroitic Cursive"/>
 *     &lt;enumeration value="Mero - Meroitic Hieroglyphs"/>
 *     &lt;enumeration value="Mlym - Malayalam"/>
 *     &lt;enumeration value="Modi - Modi, Moḍī"/>
 *     &lt;enumeration value="Mong - Mongolian"/>
 *     &lt;enumeration value="Moon - Moon (Moon code, Moon script, Moon type)"/>
 *     &lt;enumeration value="Mroo - Mro, Mru"/>
 *     &lt;enumeration value="Mtei - Meitei Mayek (Meithei, Meetei)"/>
 *     &lt;enumeration value="Mult - Multani"/>
 *     &lt;enumeration value="Mymr - Myanmar (Burmese)"/>
 *     &lt;enumeration value="Narb - Old North Arabian (Ancient North Arabian)"/>
 *     &lt;enumeration value="Nbat - Nabataean"/>
 *     &lt;enumeration value="Newa - Newa, Newar, Newari"/>
 *     &lt;enumeration value="Nkgb - Nakhi Geba"/>
 *     &lt;enumeration value="Nkoo - N’Ko"/>
 *     &lt;enumeration value="Nshu - Nüshu"/>
 *     &lt;enumeration value="Ogam - Ogham"/>
 *     &lt;enumeration value="Olck - Ol Chiki (Ol Cemet’, Ol, Santali)"/>
 *     &lt;enumeration value="Orkh - Old Turkic, Orkhon Runic"/>
 *     &lt;enumeration value="Orya - Oriya"/>
 *     &lt;enumeration value="Osge - Osage"/>
 *     &lt;enumeration value="Osma - Osmanya"/>
 *     &lt;enumeration value="Palm - Palmyrene"/>
 *     &lt;enumeration value="Pauc - Pau Cin Hau"/>
 *     &lt;enumeration value="Perm - Old Permic"/>
 *     &lt;enumeration value="Phag - Phags-pa"/>
 *     &lt;enumeration value="Phli - Inscriptional Pahlavi"/>
 *     &lt;enumeration value="Phlp - Psalter Pahlavi"/>
 *     &lt;enumeration value="Phlv - Book Pahlavi"/>
 *     &lt;enumeration value="Phnx - Phoenician"/>
 *     &lt;enumeration value="Piqd - Klingon (KLI pIqaD)"/>
 *     &lt;enumeration value="Plrd - Miao (Pollard)"/>
 *     &lt;enumeration value="Prti - Inscriptional Parthian"/>
 *     &lt;enumeration value="Rjng - Rejang (Redjang, Kaganga)"/>
 *     &lt;enumeration value="Roro - Rongorongo"/>
 *     &lt;enumeration value="Runr - Runic"/>
 *     &lt;enumeration value="Samr - Samaritan"/>
 *     &lt;enumeration value="Sara - Sarati"/>
 *     &lt;enumeration value="Sarb - Old South Arabian"/>
 *     &lt;enumeration value="Saur - Saurashtra"/>
 *     &lt;enumeration value="Sgnw - SignWriting"/>
 *     &lt;enumeration value="Shaw - Shavian (Shaw)"/>
 *     &lt;enumeration value="Shrd - Sharada, Śāradā"/>
 *     &lt;enumeration value="Sidd - Siddham"/>
 *     &lt;enumeration value="Sind - Khudawadi, Sindhi"/>
 *     &lt;enumeration value="Sinh - Sinhala"/>
 *     &lt;enumeration value="Sora - Sora Sompeng"/>
 *     &lt;enumeration value="Sund - Sundanese"/>
 *     &lt;enumeration value="Sylo - Syloti Nagri"/>
 *     &lt;enumeration value="Syrc - Syriac"/>
 *     &lt;enumeration value="Syre - Syriac (Estrangelo variant)"/>
 *     &lt;enumeration value="Syrj - Syriac (Western variant)"/>
 *     &lt;enumeration value="Syrn - Syriac (Eastern variant)"/>
 *     &lt;enumeration value="Tagb - Tagbanwa"/>
 *     &lt;enumeration value="Takr - Takri"/>
 *     &lt;enumeration value="Tale - Tai Le"/>
 *     &lt;enumeration value="Talu - New Tai Lue"/>
 *     &lt;enumeration value="Taml - Tamil"/>
 *     &lt;enumeration value="Tang - Tangut"/>
 *     &lt;enumeration value="Tavt - Tai Viet"/>
 *     &lt;enumeration value="Telu - Telugu"/>
 *     &lt;enumeration value="Teng - Tengwar"/>
 *     &lt;enumeration value="Tfng - Tifinagh (Berber)"/>
 *     &lt;enumeration value="Tglg - Tagalog (Baybayin, Alibata)"/>
 *     &lt;enumeration value="Thaa - Thaana"/>
 *     &lt;enumeration value="Thai - Thai"/>
 *     &lt;enumeration value="Tibt - Tibetan"/>
 *     &lt;enumeration value="Tirh - Tirhuta"/>
 *     &lt;enumeration value="Ugar - Ugaritic"/>
 *     &lt;enumeration value="Vaii - Vai"/>
 *     &lt;enumeration value="Visp - Visible Speech"/>
 *     &lt;enumeration value="Wara - Warang Citi (Varang Kshiti)"/>
 *     &lt;enumeration value="Wole - Woleai"/>
 *     &lt;enumeration value="Xpeo - Old Persian"/>
 *     &lt;enumeration value="Xsux - Cuneiform, Sumero-Akkadian"/>
 *     &lt;enumeration value="Yiii - Yi"/>
 *     &lt;enumeration value="Zinh - Code for inherited script"/>
 *     &lt;enumeration value="Zmth - Mathematical notation"/>
 *     &lt;enumeration value="Zsye - Symbols (Emoji variant)"/>
 *     &lt;enumeration value="Zsym - Symbols"/>
 *     &lt;enumeration value="Zxxx - Code for unwritten documents"/>
 *     &lt;enumeration value="Zyyy - Code for undetermined script"/>
 *     &lt;enumeration value="Zzzz - Code for uncoded script"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScriptSimpleType")
@XmlEnum
public enum ScriptSimpleType {

    @XmlEnumValue("Adlm - Adlam")
    ADLM_ADLAM("Adlm - Adlam"),
    @XmlEnumValue("Afak - Afaka")
    AFAK_AFAKA("Afak - Afaka"),
    @XmlEnumValue("Aghb - Caucasian Albanian")
    AGHB_CAUCASIAN_ALBANIAN("Aghb - Caucasian Albanian"),
    @XmlEnumValue("Ahom - Ahom, Tai Ahom")
    AHOM_AHOM_TAI_AHOM("Ahom - Ahom, Tai Ahom"),
    @XmlEnumValue("Arab - Arabic")
    ARAB_ARABIC("Arab - Arabic"),
    @XmlEnumValue("Aran - Arabic (Nastaliq variant)")
    ARAN_ARABIC_NASTALIQ_VARIANT("Aran - Arabic (Nastaliq variant)"),
    @XmlEnumValue("Armi - Imperial Aramaic")
    ARMI_IMPERIAL_ARAMAIC("Armi - Imperial Aramaic"),
    @XmlEnumValue("Armn - Armenian")
    ARMN_ARMENIAN("Armn - Armenian"),
    @XmlEnumValue("Avst - Avestan")
    AVST_AVESTAN("Avst - Avestan"),
    @XmlEnumValue("Bali - Balinese")
    BALI_BALINESE("Bali - Balinese"),
    @XmlEnumValue("Bamu - Bamum")
    BAMU_BAMUM("Bamu - Bamum"),
    @XmlEnumValue("Bass - Bassa Vah")
    BASS_BASSA_VAH("Bass - Bassa Vah"),
    @XmlEnumValue("Batk - Batak")
    BATK_BATAK("Batk - Batak"),
    @XmlEnumValue("Beng - Bengali")
    BENG_BENGALI("Beng - Bengali"),
    @XmlEnumValue("Bhks - Bhaiksuki")
    BHKS_BHAIKSUKI("Bhks - Bhaiksuki"),
    @XmlEnumValue("Blis - Blissymbols")
    BLIS_BLISSYMBOLS("Blis - Blissymbols"),
    @XmlEnumValue("Bopo - Bopomofo")
    BOPO_BOPOMOFO("Bopo - Bopomofo"),
    @XmlEnumValue("Brah - Brahmi")
    BRAH_BRAHMI("Brah - Brahmi"),
    @XmlEnumValue("Brai - Braille")
    BRAI_BRAILLE("Brai - Braille"),
    @XmlEnumValue("Bugi - Buginese")
    BUGI_BUGINESE("Bugi - Buginese"),
    @XmlEnumValue("Buhd - Buhid")
    BUHD_BUHID("Buhd - Buhid"),
    @XmlEnumValue("Cakm - Chakma")
    CAKM_CHAKMA("Cakm - Chakma"),
    @XmlEnumValue("Cans - Unified Canadian Aboriginal Syllabics")
    CANS_UNIFIED_CANADIAN_ABORIGINAL_SYLLABICS("Cans - Unified Canadian Aboriginal Syllabics"),
    @XmlEnumValue("Cari - Carian")
    CARI_CARIAN("Cari - Carian"),
    @XmlEnumValue("Cham - Cham")
    CHAM_CHAM("Cham - Cham"),
    @XmlEnumValue("Cher - Cherokee")
    CHER_CHEROKEE("Cher - Cherokee"),
    @XmlEnumValue("Cirt - Cirth")
    CIRT_CIRTH("Cirt - Cirth"),
    @XmlEnumValue("Copt - Coptic")
    COPT_COPTIC("Copt - Coptic"),
    @XmlEnumValue("Cprt - Cypriot")
    CPRT_CYPRIOT("Cprt - Cypriot"),
    @XmlEnumValue("Cyrl - Cyrillic")
    CYRL_CYRILLIC("Cyrl - Cyrillic"),
    @XmlEnumValue("Cyrs - Cyrillic (Old Church Slavonic variant)")
    CYRS_CYRILLIC_OLD_CHURCH_SLAVONIC_VARIANT("Cyrs - Cyrillic (Old Church Slavonic variant)"),
    @XmlEnumValue("Deva - Devanagari (Nagari)")
    DEVA_DEVANAGARI_NAGARI("Deva - Devanagari (Nagari)"),
    @XmlEnumValue("Dsrt - Deseret (Mormon)")
    DSRT_DESERET_MORMON("Dsrt - Deseret (Mormon)"),
    @XmlEnumValue("Dupl - Duployan shorthand, Duployan stenography")
    DUPL_DUPLOYAN_SHORTHAND_DUPLOYAN_STENOGRAPHY("Dupl - Duployan shorthand, Duployan stenography"),
    @XmlEnumValue("Egyd - Egyptian demotic")
    EGYD_EGYPTIAN_DEMOTIC("Egyd - Egyptian demotic"),
    @XmlEnumValue("Egyh - Egyptian hieratic")
    EGYH_EGYPTIAN_HIERATIC("Egyh - Egyptian hieratic"),
    @XmlEnumValue("Egyp - Egyptian hieroglyphs")
    EGYP_EGYPTIAN_HIEROGLYPHS("Egyp - Egyptian hieroglyphs"),
    @XmlEnumValue("Elba - Elbasan")
    ELBA_ELBASAN("Elba - Elbasan"),
    @XmlEnumValue("Ethi - Ethiopic")
    ETHI_ETHIOPIC("Ethi - Ethiopic"),
    @XmlEnumValue("Geok - Khutsuri (Asomtavruli and Nuskhuri)")
    GEOK_KHUTSURI_ASOMTAVRULI_AND_NUSKHURI("Geok - Khutsuri (Asomtavruli and Nuskhuri)"),
    @XmlEnumValue("Geor - Georgian (Mkhedruli)")
    GEOR_GEORGIAN_MKHEDRULI("Geor - Georgian (Mkhedruli)"),
    @XmlEnumValue("Glag - Glagolitic")
    GLAG_GLAGOLITIC("Glag - Glagolitic"),
    @XmlEnumValue("Goth - Gothic")
    GOTH_GOTHIC("Goth - Gothic"),
    @XmlEnumValue("Gran - Grantha")
    GRAN_GRANTHA("Gran - Grantha"),
    @XmlEnumValue("Grek - Greek")
    GREK_GREEK("Grek - Greek"),
    @XmlEnumValue("Gujr - Gujarati")
    GUJR_GUJARATI("Gujr - Gujarati"),
    @XmlEnumValue("Guru - Gurmukhi")
    GURU_GURMUKHI("Guru - Gurmukhi"),
    @XmlEnumValue("Hanb - Han with Bopomofo")
    HANB_HAN_WITH_BOPOMOFO("Hanb - Han with Bopomofo"),
    @XmlEnumValue("Hang - Hangul")
    HANG_HANGUL("Hang - Hangul"),
    @XmlEnumValue("Hani - Han (Hanzi, Kanji, Hanja)")
    HANI_HAN_HANZI_KANJI_HANJA("Hani - Han (Hanzi, Kanji, Hanja)"),
    @XmlEnumValue("Hano - Hanunoo (Hanun\u00f3o)")
    HANO_HANUNOO_HANUNÓO("Hano - Hanunoo (Hanun\u00f3o)"),
    @XmlEnumValue("Hans - Han (Simplified variant)")
    HANS_HAN_SIMPLIFIED_VARIANT("Hans - Han (Simplified variant)"),
    @XmlEnumValue("Hant - Han (Traditional variant)")
    HANT_HAN_TRADITIONAL_VARIANT("Hant - Han (Traditional variant)"),
    @XmlEnumValue("Hatr - Hatran")
    HATR_HATRAN("Hatr - Hatran"),
    @XmlEnumValue("Hebr - Hebrew")
    HEBR_HEBREW("Hebr - Hebrew"),
    @XmlEnumValue("Hira - Hiragana")
    HIRA_HIRAGANA("Hira - Hiragana"),
    @XmlEnumValue("Hluw - Anatolian Hieroglyphs")
    HLUW_ANATOLIAN_HIEROGLYPHS("Hluw - Anatolian Hieroglyphs"),
    @XmlEnumValue("Hmng - Pahawh Hmong")
    HMNG_PAHAWH_HMONG("Hmng - Pahawh Hmong"),
    @XmlEnumValue("Hrkt - Japanese syllabaries")
    HRKT_JAPANESE_SYLLABARIES("Hrkt - Japanese syllabaries"),
    @XmlEnumValue("Hung - Old Hungarian (Hungarian Runic)")
    HUNG_OLD_HUNGARIAN_HUNGARIAN_RUNIC("Hung - Old Hungarian (Hungarian Runic)"),
    @XmlEnumValue("Inds - Indus (Harappan)")
    INDS_INDUS_HARAPPAN("Inds - Indus (Harappan)"),
    @XmlEnumValue("Ital - Old Italic (Etruscan, Oscan etc.)")
    ITAL_OLD_ITALIC_ETRUSCAN_OSCAN_ETC("Ital - Old Italic (Etruscan, Oscan etc.)"),
    @XmlEnumValue("Jamo - Jamo")
    JAMO_JAMO("Jamo - Jamo"),
    @XmlEnumValue("Java - Javanese")
    JAVA_JAVANESE("Java - Javanese"),
    @XmlEnumValue("Jpan - Japanese")
    JPAN_JAPANESE("Jpan - Japanese"),
    @XmlEnumValue("Jurc - Jurchen")
    JURC_JURCHEN("Jurc - Jurchen"),
    @XmlEnumValue("Kali - Kayah Li")
    KALI_KAYAH_LI("Kali - Kayah Li"),
    @XmlEnumValue("Kana - Katakana")
    KANA_KATAKANA("Kana - Katakana"),
    @XmlEnumValue("Khar - Kharoshthi")
    KHAR_KHAROSHTHI("Khar - Kharoshthi"),
    @XmlEnumValue("Khmr - Khmer")
    KHMR_KHMER("Khmr - Khmer"),
    @XmlEnumValue("Khoj - Khojki")
    KHOJ_KHOJKI("Khoj - Khojki"),
    @XmlEnumValue("Kitl - Khitan large script")
    KITL_KHITAN_LARGE_SCRIPT("Kitl - Khitan large script"),
    @XmlEnumValue("Kits - Khitan small script")
    KITS_KHITAN_SMALL_SCRIPT("Kits - Khitan small script"),
    @XmlEnumValue("Knda - Kannada")
    KNDA_KANNADA("Knda - Kannada"),
    @XmlEnumValue("Kore - Korean (alias for Hangul + Han)")
    KORE_KOREAN_ALIAS_FOR_HANGUL_HAN("Kore - Korean (alias for Hangul + Han)"),
    @XmlEnumValue("Kpel - Kpelle")
    KPEL_KPELLE("Kpel - Kpelle"),
    @XmlEnumValue("Kthi - Kaithi")
    KTHI_KAITHI("Kthi - Kaithi"),
    @XmlEnumValue("Lana - Tai Tham (Lanna)")
    LANA_TAI_THAM_LANNA("Lana - Tai Tham (Lanna)"),
    @XmlEnumValue("Laoo - Lao")
    LAOO_LAO("Laoo - Lao"),
    @XmlEnumValue("Latf - Latin (Fraktur variant)")
    LATF_LATIN_FRAKTUR_VARIANT("Latf - Latin (Fraktur variant)"),
    @XmlEnumValue("Latg - Latin (Gaelic variant)")
    LATG_LATIN_GAELIC_VARIANT("Latg - Latin (Gaelic variant)"),
    @XmlEnumValue("Latn - Latin")
    LATN_LATIN("Latn - Latin"),
    @XmlEnumValue("Leke - Leke")
    LEKE_LEKE("Leke - Leke"),
    @XmlEnumValue("Lepc - Lepcha (R\u00f3ng)")
    LEPC_LEPCHA_RÓNG("Lepc - Lepcha (R\u00f3ng)"),
    @XmlEnumValue("Limb - Limbu")
    LIMB_LIMBU("Limb - Limbu"),
    @XmlEnumValue("Lina - Linear A")
    LINA_LINEAR_A("Lina - Linear A"),
    @XmlEnumValue("Linb - Linear B")
    LINB_LINEAR_B("Linb - Linear B"),
    @XmlEnumValue("Lisu - Lisu (Fraser)")
    LISU_LISU_FRASER("Lisu - Lisu (Fraser)"),
    @XmlEnumValue("Loma - Loma")
    LOMA_LOMA("Loma - Loma"),
    @XmlEnumValue("Lyci - Lycian")
    LYCI_LYCIAN("Lyci - Lycian"),
    @XmlEnumValue("Lydi - Lydian")
    LYDI_LYDIAN("Lydi - Lydian"),
    @XmlEnumValue("Mahj - Mahajani")
    MAHJ_MAHAJANI("Mahj - Mahajani"),
    @XmlEnumValue("Mand - Mandaic, Mandaean")
    MAND_MANDAIC_MANDAEAN("Mand - Mandaic, Mandaean"),
    @XmlEnumValue("Mani - Manichaean")
    MANI_MANICHAEAN("Mani - Manichaean"),
    @XmlEnumValue("Marc - Marchen")
    MARC_MARCHEN("Marc - Marchen"),
    @XmlEnumValue("Maya - Mayan hieroglyphs")
    MAYA_MAYAN_HIEROGLYPHS("Maya - Mayan hieroglyphs"),
    @XmlEnumValue("Mend - Mende Kikakui")
    MEND_MENDE_KIKAKUI("Mend - Mende Kikakui"),
    @XmlEnumValue("Merc - Meroitic Cursive")
    MERC_MEROITIC_CURSIVE("Merc - Meroitic Cursive"),
    @XmlEnumValue("Mero - Meroitic Hieroglyphs")
    MERO_MEROITIC_HIEROGLYPHS("Mero - Meroitic Hieroglyphs"),
    @XmlEnumValue("Mlym - Malayalam")
    MLYM_MALAYALAM("Mlym - Malayalam"),
    @XmlEnumValue("Modi - Modi, Mo\u1e0d\u012b")
    MODI_MODI_MOḌĪ("Modi - Modi, Mo\u1e0d\u012b"),
    @XmlEnumValue("Mong - Mongolian")
    MONG_MONGOLIAN("Mong - Mongolian"),
    @XmlEnumValue("Moon - Moon (Moon code, Moon script, Moon type)")
    MOON_MOON_MOON_CODE_MOON_SCRIPT_MOON_TYPE("Moon - Moon (Moon code, Moon script, Moon type)"),
    @XmlEnumValue("Mroo - Mro, Mru")
    MROO_MRO_MRU("Mroo - Mro, Mru"),
    @XmlEnumValue("Mtei - Meitei Mayek (Meithei, Meetei)")
    MTEI_MEITEI_MAYEK_MEITHEI_MEETEI("Mtei - Meitei Mayek (Meithei, Meetei)"),
    @XmlEnumValue("Mult - Multani")
    MULT_MULTANI("Mult - Multani"),
    @XmlEnumValue("Mymr - Myanmar (Burmese)")
    MYMR_MYANMAR_BURMESE("Mymr - Myanmar (Burmese)"),
    @XmlEnumValue("Narb - Old North Arabian (Ancient North Arabian)")
    NARB_OLD_NORTH_ARABIAN_ANCIENT_NORTH_ARABIAN("Narb - Old North Arabian (Ancient North Arabian)"),
    @XmlEnumValue("Nbat - Nabataean")
    NBAT_NABATAEAN("Nbat - Nabataean"),
    @XmlEnumValue("Newa - Newa, Newar, Newari")
    NEWA_NEWA_NEWAR_NEWARI("Newa - Newa, Newar, Newari"),
    @XmlEnumValue("Nkgb - Nakhi Geba")
    NKGB_NAKHI_GEBA("Nkgb - Nakhi Geba"),
    @XmlEnumValue("Nkoo - N\u2019Ko")
    NKOO_N_KO("Nkoo - N\u2019Ko"),
    @XmlEnumValue("Nshu - N\u00fcshu")
    NSHU_NÜSHU("Nshu - N\u00fcshu"),
    @XmlEnumValue("Ogam - Ogham")
    OGAM_OGHAM("Ogam - Ogham"),
    @XmlEnumValue("Olck - Ol Chiki (Ol Cemet\u2019, Ol, Santali)")
    OLCK_OL_CHIKI_OL_CEMET_OL_SANTALI("Olck - Ol Chiki (Ol Cemet\u2019, Ol, Santali)"),
    @XmlEnumValue("Orkh - Old Turkic, Orkhon Runic")
    ORKH_OLD_TURKIC_ORKHON_RUNIC("Orkh - Old Turkic, Orkhon Runic"),
    @XmlEnumValue("Orya - Oriya")
    ORYA_ORIYA("Orya - Oriya"),
    @XmlEnumValue("Osge - Osage")
    OSGE_OSAGE("Osge - Osage"),
    @XmlEnumValue("Osma - Osmanya")
    OSMA_OSMANYA("Osma - Osmanya"),
    @XmlEnumValue("Palm - Palmyrene")
    PALM_PALMYRENE("Palm - Palmyrene"),
    @XmlEnumValue("Pauc - Pau Cin Hau")
    PAUC_PAU_CIN_HAU("Pauc - Pau Cin Hau"),
    @XmlEnumValue("Perm - Old Permic")
    PERM_OLD_PERMIC("Perm - Old Permic"),
    @XmlEnumValue("Phag - Phags-pa")
    PHAG_PHAGS_PA("Phag - Phags-pa"),
    @XmlEnumValue("Phli - Inscriptional Pahlavi")
    PHLI_INSCRIPTIONAL_PAHLAVI("Phli - Inscriptional Pahlavi"),
    @XmlEnumValue("Phlp - Psalter Pahlavi")
    PHLP_PSALTER_PAHLAVI("Phlp - Psalter Pahlavi"),
    @XmlEnumValue("Phlv - Book Pahlavi")
    PHLV_BOOK_PAHLAVI("Phlv - Book Pahlavi"),
    @XmlEnumValue("Phnx - Phoenician")
    PHNX_PHOENICIAN("Phnx - Phoenician"),
    @XmlEnumValue("Piqd - Klingon (KLI pIqaD)")
    PIQD_KLINGON_KLI_P_IQA_D("Piqd - Klingon (KLI pIqaD)"),
    @XmlEnumValue("Plrd - Miao (Pollard)")
    PLRD_MIAO_POLLARD("Plrd - Miao (Pollard)"),
    @XmlEnumValue("Prti - Inscriptional Parthian")
    PRTI_INSCRIPTIONAL_PARTHIAN("Prti - Inscriptional Parthian"),
    @XmlEnumValue("Rjng - Rejang (Redjang, Kaganga)")
    RJNG_REJANG_REDJANG_KAGANGA("Rjng - Rejang (Redjang, Kaganga)"),
    @XmlEnumValue("Roro - Rongorongo")
    RORO_RONGORONGO("Roro - Rongorongo"),
    @XmlEnumValue("Runr - Runic")
    RUNR_RUNIC("Runr - Runic"),
    @XmlEnumValue("Samr - Samaritan")
    SAMR_SAMARITAN("Samr - Samaritan"),
    @XmlEnumValue("Sara - Sarati")
    SARA_SARATI("Sara - Sarati"),
    @XmlEnumValue("Sarb - Old South Arabian")
    SARB_OLD_SOUTH_ARABIAN("Sarb - Old South Arabian"),
    @XmlEnumValue("Saur - Saurashtra")
    SAUR_SAURASHTRA("Saur - Saurashtra"),
    @XmlEnumValue("Sgnw - SignWriting")
    SGNW_SIGN_WRITING("Sgnw - SignWriting"),
    @XmlEnumValue("Shaw - Shavian (Shaw)")
    SHAW_SHAVIAN_SHAW("Shaw - Shavian (Shaw)"),
    @XmlEnumValue("Shrd - Sharada, \u015a\u0101rad\u0101")
    SHRD_SHARADA_ŚĀRADĀ("Shrd - Sharada, \u015a\u0101rad\u0101"),
    @XmlEnumValue("Sidd - Siddham")
    SIDD_SIDDHAM("Sidd - Siddham"),
    @XmlEnumValue("Sind - Khudawadi, Sindhi")
    SIND_KHUDAWADI_SINDHI("Sind - Khudawadi, Sindhi"),
    @XmlEnumValue("Sinh - Sinhala")
    SINH_SINHALA("Sinh - Sinhala"),
    @XmlEnumValue("Sora - Sora Sompeng")
    SORA_SORA_SOMPENG("Sora - Sora Sompeng"),
    @XmlEnumValue("Sund - Sundanese")
    SUND_SUNDANESE("Sund - Sundanese"),
    @XmlEnumValue("Sylo - Syloti Nagri")
    SYLO_SYLOTI_NAGRI("Sylo - Syloti Nagri"),
    @XmlEnumValue("Syrc - Syriac")
    SYRC_SYRIAC("Syrc - Syriac"),
    @XmlEnumValue("Syre - Syriac (Estrangelo variant)")
    SYRE_SYRIAC_ESTRANGELO_VARIANT("Syre - Syriac (Estrangelo variant)"),
    @XmlEnumValue("Syrj - Syriac (Western variant)")
    SYRJ_SYRIAC_WESTERN_VARIANT("Syrj - Syriac (Western variant)"),
    @XmlEnumValue("Syrn - Syriac (Eastern variant)")
    SYRN_SYRIAC_EASTERN_VARIANT("Syrn - Syriac (Eastern variant)"),
    @XmlEnumValue("Tagb - Tagbanwa")
    TAGB_TAGBANWA("Tagb - Tagbanwa"),
    @XmlEnumValue("Takr - Takri")
    TAKR_TAKRI("Takr - Takri"),
    @XmlEnumValue("Tale - Tai Le")
    TALE_TAI_LE("Tale - Tai Le"),
    @XmlEnumValue("Talu - New Tai Lue")
    TALU_NEW_TAI_LUE("Talu - New Tai Lue"),
    @XmlEnumValue("Taml - Tamil")
    TAML_TAMIL("Taml - Tamil"),
    @XmlEnumValue("Tang - Tangut")
    TANG_TANGUT("Tang - Tangut"),
    @XmlEnumValue("Tavt - Tai Viet")
    TAVT_TAI_VIET("Tavt - Tai Viet"),
    @XmlEnumValue("Telu - Telugu")
    TELU_TELUGU("Telu - Telugu"),
    @XmlEnumValue("Teng - Tengwar")
    TENG_TENGWAR("Teng - Tengwar"),
    @XmlEnumValue("Tfng - Tifinagh (Berber)")
    TFNG_TIFINAGH_BERBER("Tfng - Tifinagh (Berber)"),
    @XmlEnumValue("Tglg - Tagalog (Baybayin, Alibata)")
    TGLG_TAGALOG_BAYBAYIN_ALIBATA("Tglg - Tagalog (Baybayin, Alibata)"),
    @XmlEnumValue("Thaa - Thaana")
    THAA_THAANA("Thaa - Thaana"),
    @XmlEnumValue("Thai - Thai")
    THAI_THAI("Thai - Thai"),
    @XmlEnumValue("Tibt - Tibetan")
    TIBT_TIBETAN("Tibt - Tibetan"),
    @XmlEnumValue("Tirh - Tirhuta")
    TIRH_TIRHUTA("Tirh - Tirhuta"),
    @XmlEnumValue("Ugar - Ugaritic")
    UGAR_UGARITIC("Ugar - Ugaritic"),
    @XmlEnumValue("Vaii - Vai")
    VAII_VAI("Vaii - Vai"),
    @XmlEnumValue("Visp - Visible Speech")
    VISP_VISIBLE_SPEECH("Visp - Visible Speech"),
    @XmlEnumValue("Wara - Warang Citi (Varang Kshiti)")
    WARA_WARANG_CITI_VARANG_KSHITI("Wara - Warang Citi (Varang Kshiti)"),
    @XmlEnumValue("Wole - Woleai")
    WOLE_WOLEAI("Wole - Woleai"),
    @XmlEnumValue("Xpeo - Old Persian")
    XPEO_OLD_PERSIAN("Xpeo - Old Persian"),
    @XmlEnumValue("Xsux - Cuneiform, Sumero-Akkadian")
    XSUX_CUNEIFORM_SUMERO_AKKADIAN("Xsux - Cuneiform, Sumero-Akkadian"),
    @XmlEnumValue("Yiii - Yi")
    YIII_YI("Yiii - Yi"),
    @XmlEnumValue("Zinh - Code for inherited script")
    ZINH_CODE_FOR_INHERITED_SCRIPT("Zinh - Code for inherited script"),
    @XmlEnumValue("Zmth - Mathematical notation")
    ZMTH_MATHEMATICAL_NOTATION("Zmth - Mathematical notation"),
    @XmlEnumValue("Zsye - Symbols (Emoji variant)")
    ZSYE_SYMBOLS_EMOJI_VARIANT("Zsye - Symbols (Emoji variant)"),
    @XmlEnumValue("Zsym - Symbols")
    ZSYM_SYMBOLS("Zsym - Symbols"),
    @XmlEnumValue("Zxxx - Code for unwritten documents")
    ZXXX_CODE_FOR_UNWRITTEN_DOCUMENTS("Zxxx - Code for unwritten documents"),
    @XmlEnumValue("Zyyy - Code for undetermined script")
    ZYYY_CODE_FOR_UNDETERMINED_SCRIPT("Zyyy - Code for undetermined script"),
    @XmlEnumValue("Zzzz - Code for uncoded script")
    ZZZZ_CODE_FOR_UNCODED_SCRIPT("Zzzz - Code for uncoded script"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ScriptSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ScriptSimpleType fromValue(String v) {
        for (ScriptSimpleType c: ScriptSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
