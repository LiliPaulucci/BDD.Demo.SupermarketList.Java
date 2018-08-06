package com.elabor8;

public class MarketProduct
{
    public String Description;
    public int Quantity;

    public MarketProduct()
    {
        this.Description = "";
        this.Quantity = 0;
    }

    public MarketProduct(String Description, int Quantity)
    {
        this.Description = Description;
        this.Quantity = Quantity;
    }
}