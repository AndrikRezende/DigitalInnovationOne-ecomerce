package com.hatanaka.ecommerce.checkout.resource;

import lombok.AllArgsConstrutor;
import lombok.NoArgsConstrutor;
import lombok.Data;

@Data
@NoArgsConstrutor
@AllArgsConstrutor
public class CheckoutRequest implements Serializable{
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String complement;
    private String country;
    private String state;
    private String cep;
    private boolean saveAdress;
    private boolean saveInfo;
    private String paymentMethodo;
    private String cardName;
    private String cardNumber;
    private String cardDate;
    private String cardCvv;

}