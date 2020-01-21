package Ejercicio2;

public class rombo 
{
	private double diagonalMayor;
	private double diagonalMenor;
	
	public double getDiagonalMayor()
	{
		return diagonalMayor;
	}
	public void setDiagonalMayor(double diagonalMayor)
	{
		this.diagonalMayor=diagonalMayor;
	}
	public double getDiagonalMenor()
	{
		return diagonalMenor;
	}
	public void setDiagonalMenor(double diagonalMenor)
	{
		this.diagonalMenor=diagonalMenor;
	}
	public rombo(double diagonalMayor,double diagonalMenor)
	{
		this.setDiagonalMayor(diagonalMayor);
		this.setDiagonalMenor(diagonalMenor);
	}
	public double areaRombo()
	{
		double area=(this.diagonalMenor*this.diagonalMayor)/2;
		return area;
	}
}
