package main;

import classes.Conversor;

public class Main
{
	public static void main(String[] args)
	{
		Conversor conversor = new Conversor();
		int inteiro = 66;
		double flutuante = 87.23;
		boolean booleano = false;
		long longo = 9l;
		System.out.printf("%d %s %n",conversor.paraInteiro(inteiro),conversor.paraInteiro(inteiro).getClass());
		System.out.printf("%f %s %n",conversor.paraDouble(flutuante),conversor.paraDouble(flutuante).getClass());
		System.out.printf("%b %s %n",conversor.paraBoolean(booleano),conversor.paraBoolean(booleano).getClass());
		System.out.printf("%d %s %n",conversor.paraLong(longo), conversor.paraLong(longo).getClass());
	}
}
