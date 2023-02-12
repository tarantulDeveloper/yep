package com.example.selim.dto;

import java.util.Date;

public record ErrorMessage(
        int statusCode, Date timestamp,
        String message, String description) {

}
