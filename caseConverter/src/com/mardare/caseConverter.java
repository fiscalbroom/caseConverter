package com.mardare;
import com.sun.source.tree.CaseTree;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class caseConverter {

    private Object Scanner;

    /**Programma per convertire una stringa in camelCase o in Snake_Case
     *
     */

    public static String convertiInstartCase(String stringa){
        StringBuilder valoreDiRitorno = new StringBuilder();
        stringa = stringa.toLowerCase();
        boolean rendiProssimoInUppercase = true;
        for (char c : stringa.toCharArray()){
            if(Character.isSpaceChar(c) || Character.isWhitespace(c) || "()[]{}\\/".indexOf(c) != -1){
                rendiProssimoInUppercase = true;
            }else if (rendiProssimoInUppercase){
                c = Character.toTitleCase(c);
                rendiProssimoInUppercase = false;
            }

            valoreDiRitorno.append(c);
        }
        return valoreDiRitorno.toString();
    }

    public static String convertiInCamelCase(String stringa){
        String caratteriDaScartare = "()[]{}=?!,:.-_+#~/";
        stringa = stringa.replaceAll("[" + Pattern.quote(caratteriDaScartare) + "]", " ");
        stringa = caseConverter.convertiInstartCase(stringa);
        return stringa.replaceAll("\\s+", "");
    }

    public static String convertiInSnakeCase(String stringa){
        String caratteriDaScartare = "()[]{}=?!,:.-_+#~/";
        stringa = stringa.replaceAll("[" + Pattern.quote(caratteriDaScartare) + "]", " ");
        stringa = caseConverter.convertiInstartCase(stringa);
        return stringa.trim().replaceAll("\\s+", "_");
    }

    public caseConverter() {
    }
}
