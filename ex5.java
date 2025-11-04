class ExemploVeiculos {
    public static void main(String[] args) {
        Automovel audi = new Automovel("Audi", "A4", 2024, 4, false);
        Automovel tesla = new Automovel("Tesla", "Model 3", 2023, 4, true);
        Automovel toyota = new Automovel("Toyota", "Corolla", 2021, 4, false);
        Motociclo ducati = new Motociclo("Ducati", "Monster", 2022, "Naked");

        audi.acelerar();
        tesla.acelerar();
        toyota.acelerar();
        ducati.acelerar();

        Estado estado = new Estado();
        estado.emMovimento(audi);
        estado.emRepouso(ducati);
    }
}

class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }

    public void acelerar() {
        System.out.println("O veículo está a ganhar velocidade.");
    }
}

class Automovel extends Veiculo {
    private int numeroDePortas;
    private boolean eletrico;

    public Automovel(String marca, String modelo, int ano, int numeroDePortas, boolean eletrico) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
        this.eletrico = eletrico;
    }

    public int getNumeroDePortas() { return numeroDePortas; }
    public boolean isEletrico() { return eletrico; }

    @Override
    public void acelerar() {
        if (eletrico) {
            System.out.println("O automóvel elétrico " + getMarca() + " acelera silenciosamente.");
        } else {
            System.out.println("O automóvel " + getMarca() + " acelera com o motor a combustão.");
        }
    }
}

class Motociclo extends Veiculo {
    private String categoria;

    public Motociclo(String marca, String modelo, int ano, String categoria) {
        super(marca, modelo, ano);
        this.categoria = categoria;
    }

    public String getCategoria() { return categoria; }

    @Override
    public void acelerar() {
        System.out.println("A mota " + getMarca() + " acelera com potência e rapidez.");
    }
}

class Estado {
    public void emMovimento(Veiculo v) {
        System.out.println("O " + v.getMarca() + " " + v.getModelo() + " está em movimento.");
    }

    public void emRepouso(Veiculo v) {
        System.out.println("O " + v.getMarca() + " " + v.getModelo() + " está parado no momento.");
    }
}
