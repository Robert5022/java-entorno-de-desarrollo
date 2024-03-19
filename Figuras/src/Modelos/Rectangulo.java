package Modelos;
import java.util.*;


public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo() {
        this.base = 1;
        this.altura = 1;
    }


public void rectangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;}

  public int getBase() {
      return this.base;}


  public void setBase(int base) {
      this.base = base;}


  public int getAltura() {
      return this.altura;}

    
  public void setAltura(int altura) {
      this.altura = altura;}


public int area() {
    return base * altura;}


public int perimetro() {
    return 2*this.base + 2*this.altura;}

}