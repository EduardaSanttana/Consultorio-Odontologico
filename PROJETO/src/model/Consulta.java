package model;

    public class Consulta {
        private String dataHora;
        private Dentista dentista;
        private Paciente paciente;
        private String descricao;
        private double valorConsulta;  

        public Consulta(Dentista dentista, Paciente paciente, String dataHora, String descricao, double valorConsulta) {
            this.dentista = dentista;
            this.paciente = paciente;
            this.dataHora = dataHora;
            this.descricao = descricao;
            this.valorConsulta = valorConsulta; 
        }

        public String getDataHora() {
            return dataHora;
        }

        public Dentista getDentista() {
            return dentista;
        }

        public Paciente getPaciente() {
            return paciente;
        }

        public String getDesc() {
            return descricao;
        }

        public double getValorConsulta() {  
            return valorConsulta;
        }
    }
