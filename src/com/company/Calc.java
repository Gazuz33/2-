package com.company;

public class Calc
{
        private Double summa;
        public Double formula1(Double x, Double y, Double z)
        {
            return (Math.pow(Math.log((1+x)*(1+x))+Math.cos(3.14*z*z*z),Math.sin(y))+Math.pow((Math.exp(x*x)+Math.cos(Math.exp(x))+Math.pow(1/y,1/2)),1/x));
        }
        public Double formula2(Double x, Double y, Double z)
        {
            return x*(Math.pow(Math.cos(Math.pow(y,2)),3))/(Math.pow(z,x));
        }
        public Double Get()
        {
            return summa;
        }
        public void Set(Double x)
        {
            summa = x;
        }
        public void Sum1(Double result)
        {
            summa += result;
        }
        public Calc()  // констр по умолчанию
        {
            summa = 0.0;
        }
    }

