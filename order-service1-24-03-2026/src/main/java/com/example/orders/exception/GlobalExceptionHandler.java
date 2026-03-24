package com.example.orders.exception;

import com.example.orders.dto.ErrorDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler({OrderNotFoundException.class})
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorDTO handleException(OrderNotFoundException e, HttpServletRequest request) {
        return new ErrorDTO(e.getMessage(), LocalDate.now(), request.getRequestURI());
    }

    @ResponseBody
    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public Map<String, ErrorDTO> handleException1(MethodArgumentNotValidException e, HttpServletRequest request) {
        List<ObjectError> errors = e.getBindingResult().getAllErrors();
        Map<String, ErrorDTO> m = new HashMap<String, ErrorDTO>();
        for (ObjectError o : errors) {
            String fieldName = ((FieldError) o).getField();
            m.put(fieldName, new ErrorDTO(o.getDefaultMessage(), LocalDate.now(), request.getRequestURI()));
        }
        return m;
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,Object> handleValidation(MethodArgumentNotValidException ex){
        List<String> errors = new ArrayList<>();
        ex.getBindingResult().getFieldErrors()
                .forEach(error -> errors.add(error.getDefaultMessage()));
        Map<String,Object> response = new HashMap<>();
        response.put("timestamp",LocalDate.now());
        response.put("errors",errors);
        return response;
    }
//    @ResponseBody
//    @ExceptionHandler({Exception.class})
//    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//    public ErrorDTO handleException(Exception e, HttpServletRequest request) {
//        return new ErrorDTO(e.getMessage(), LocalDate.now(), request.getRequestURI());
//    }
}
