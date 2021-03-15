package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class ThreeFunctions {


@RestController
public class ThreeFunctions {
	

	
	@RequestMapping(method = RequestMethod.GET, path= "/equal")
    public double Addition(double numOne, double numTwo) {
		double sum = numOne + numTwo;
        return sum;
    }
	
	@RequestMapping(method = RequestMethod.GET, path= "/multi")
    public double Multiplication(double numOne, double numTwo) {
		double sum = numOne * numTwo;
        return sum;
    }
	@RequestMapping(method = RequestMethod.GET, path= "/divi")
    public double Divide(double numOne, double numTwo) {
		double sum = numOne / numTwo;
        return sum;
    }	

}






