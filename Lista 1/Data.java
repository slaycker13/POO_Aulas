public class Data{
    private final int dia;
    private final int mes;
    private final int ano;
    private final boolean bissexto;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            bissexto = true;
        } else {
            bissexto = false;
        }
    }

    public void validar(){
        if(ano > 0){
            if(mes > 0 && mes <= 12){
                if(mes == 2){
                    if(bissexto == true){
                        if(dia > 0 && dia <= 29){
                            System.out.println("A data é válida!");
                        } else {
                            System.out.println("A data é inválida!");
                        }
                    } else {
                        if(dia > 0 && dia <= 28){
                            System.out.println("A data é válida!");
                        } else {
                            System.out.println("A data é inválida!");
                        }
                    }
                } else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                    if(dia > 0 && dia <= 31){
                        System.out.println("A data é válida!");
                    } else {
                        System.out.println("A data é inválida!");
                    }
                } else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                    if(dia > 0 && dia <= 30){
                        System.out.println("A data é válida!");
                    } else {
                        System.out.println("A data é inválida!");
                    }
                }
            } else {
                System.out.println("A data é inválida!");
            }
        } else {
            System.out.println("A data é inválida!");
        }
    }

    public void validar2() { // mais lógico e resumido (chatGPT)
        if (ano <= 0 || mes < 1 || mes > 12) {
            System.out.println("A data é inválida!");
            return;
        }
        int maxDias;
        if (mes == 2) {
            maxDias = bissexto ? 29 : 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            maxDias = 30;
        } else {
            maxDias = 31;
        }

        if (dia > 0 && dia <= maxDias) {
            System.out.println("A data é válida!");
        } else {
            System.out.println("A data é inválida!");
        }
    }

    public void exibirData(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }


    public static void main(String[] args) {
        int[][] testes = {
            {29, 2, 2024}, // válido (bissexto)
            {29, 2, 2023}, // inválido
            {31, 4, 2023}, // inválido (abril tem 30)
            {30, 4, 2023}, // válido
            {31, 12, 2025}, // válido
            {32, 1, 2025}, // inválido
            {10, 13, 2024}, // mês inválido
            {0, 5, 2024} // dia inválido
        };
        for (int[] t : testes) {
            Data d = new Data(t[0], t[1], t[2]);
            d.exibirData();
            d.validar2();
            System.out.println("---");
        }
    }
}