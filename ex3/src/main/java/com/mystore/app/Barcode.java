package com.mystore.app;

import org.springframework.stereotype.Component;

@Component
class Barcode {

    public Barcode() {
        System.out.println("In Barcode constructor");
    }

    public String createBarcode(Product p) {
        String bcode = "|";
        int hashcode = p.getId() + p.getName().hashCode();

        String numberStr = String.valueOf(hashcode);

        for (char digitChar : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar);
            bcode += (digit % 2 == 0) ? "❚" : "|";
        }

        return bcode + "|";
    }
}