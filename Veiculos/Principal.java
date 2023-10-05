package Veiculos;

public class Principal {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo ("Maserati", "mc20",2020,"Preto");
		System.out.println("Veiculo: ");
		System.out.println("Marca: " + veiculo.getMarca());
		System.out.println("Modelo: " + veiculo.getModelo());
		System.out.println("Ano: "+ veiculo.getAno());
		System.out.println("cor: "+ veiculo.getCor());
		
		Moto moto = new Moto ("Yamaha", "Mt09", 2020, "Preto/Verde", 900);
		System.out.println("Moto: ");
		System.out.println("Marca: " + moto.getMarca());
		System.out.println("Modelo: " + moto.getModelo());
		System.out.println("Ano: "+ moto.getAno());
		System.out.println("cor: "+ moto.getCor());
		System.out.println("Cilindrada: "+ moto.getCilindrada());
		
		Automovel automovel = new Automovel ("Porsche", "Taycan", 2021, "Preta", 2, "Nenhum");
		System.out.println("Automovel: ");
		System.out.println("Marca: " + automovel.getMarca());
		System.out.println("Modelo: " + automovel.getModelo());
		System.out.println("Ano: "+ automovel.getAno());
		System.out.println("cor: "+ automovel.getCor());
		System.out.println("Numero De Portas: "+ automovel.getNumeroPortas());
		System.out.println("Motor: "+ automovel.getMotor());
		
	}

}
