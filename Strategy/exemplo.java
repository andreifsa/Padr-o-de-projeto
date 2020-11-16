public interface Strategy {

     
        double calcularComissao(double valorVenda);
    }

  
    public enum Cargo implements Strategy{
        ATENDENTE {
            @Override
            public double calcularComissao(double valorVenda) {
                return (valorVenda * 0.01);
            }
        },
        VENDEDOR {
            @Override
            public double calcularComissao(double valorVenda) {
                return (valorVenda * 0.02);
            }
        },
        GERENTE {
            @Override
            public double calcularComissao(double valorVenda) {
                return (100 + valorVenda * 0.03);
            }
        };
    }


    public class Funcionario {
        private long id;
     
        private Strategy cargo;
        
    }

  
    public class Venda {

        private double valorVenda;
        private Funcionario funcionario;

       

        public void save() {
         
            final double valorComissao = this.funcionario.getCargo().calcularComissao(this.valorVenda);
          
        }
    }
