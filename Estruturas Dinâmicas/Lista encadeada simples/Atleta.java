public class Atleta {

        private String nome;
        private Double altura;
        private Double peso;
        private String esporte;
        private String patrocinadores;
    
        public Atleta(String nome, Double altura, Double peso, String esporte, String patrocinadores){
            this.nome = nome;
            this.altura = altura;
            this.peso = peso;
            this.esporte = esporte;
            this.patrocinadores = patrocinadores;
        }
    
        public String getNome() {
            return nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
    
        public Double getAltura() {
            return altura;
        }
        public void setAltura(Double altura){
            this.altura = altura;
        }

        public Double getPeso() {
            return peso;
        }
        public void setPeso(Double peso){
            this.peso = peso;
        }

        public String getEsporte() {
            return esporte;
        }
        public void setEsporte(String esporte){
            this.esporte = esporte;
        }

        public String getPatrocinadores() {
            return patrocinadores;
        }
        public void setPatrocinadores(String patrocinadores){
            this.patrocinadores = patrocinadores;
        }

        public String toString(){
            return "\n Nome: " + this.nome + "\n Altura: " + this.altura + "\n Peso: " + this.peso + "\n Esporte: " + this.esporte + "\n Patrocinadores: " + this. patrocinadores;
        }
    }

