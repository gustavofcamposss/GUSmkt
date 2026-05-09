package com.gusMkt.catalogService.util;

public class EanValidator {

    public static boolean isValidEan(String ean) {
        if (ean == null) return false;
        String s = ean.trim();

        // Aceita apenas números
        if (!s.matches("\\d+")) return false;

        // Aceita apenas tamanhos comuns de EAN
        return s.length() == 8 || s.length() == 12 || s.length() == 13 || s.length() == 14;
    }
}

