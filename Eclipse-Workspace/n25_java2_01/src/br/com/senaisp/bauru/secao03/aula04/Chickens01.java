package br.com.senaisp.bauru.secao03.aula04;

public class Chickens01 {

	public static void main(String[] args) {
		int totalEggs = 0;
		int eggsPerChicken = 4 /*5*/, chickenCount = 8 /*3*/;
		// 1º dia
		totalEggs += eggsPerChicken * chickenCount; // cada galinha produz 4 ovos, totalizando 32 ovos
		// 2º dia
		chickenCount++; // ganhou uma galinha. Temos agora 9 galinhas
		totalEggs += eggsPerChicken * chickenCount; // galinhas produziram 36 ovos, somando com 32 ovos anteriores, totaliza 68 ovos
		// 3º dia
		chickenCount /= 2; // animal come metade das galinhas. Agora temos 4 galinhas.
		totalEggs += eggsPerChicken * chickenCount; // galinhas produziram 16 ovos, somando com 68 ovos anteriores, totaliza 84 ovos
		// imprimir o total
		System.out.println(totalEggs); // 84
	}

}
