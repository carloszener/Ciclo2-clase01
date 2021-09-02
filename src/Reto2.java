public class Reto2 {

    class Dispositivo {
    
        private final Integer PESO_BASE = 1;
        private final char CONSUMO_W_BASE = 'F';
        private final double PRECIO_BASE = 100.0;
        private Integer peso = 0;
        private char consumoW = 'f';
        private double precioBase;
        
        public Dispositivo () {

            this.peso = PESO_BASE;
            this.precioBase = PRECIO_BASE;
            this.consumoW = CONSUMO_W_BASE;        

        }
        
        public Dispositivo (Double precioBase, Integer peso){

            this.precioBase = precioBase;
            this.peso = peso;
            this.consumoW = CONSUMO_W_BASE;
            
        }

        public Dispositivo (Double precioBase, Integer peso, char consumoW){

            this.precioBase = precioBase;
            this.peso = peso;
            this.consumoW = consumoW;
            
        }

        public void calcularConsumoW(){    

        }
        
        public double calcularPrecio(){
            
            double adicion = 0d;
            switch (consumoW){
                case 'A': adicion += 100;
                    break;
                case 'B': adicion += 80;
                    break;
                case 'C': adicion += 60;
                    break;
                case 'D': adicion += 50;
                    break;
                case 'E': adicion += 30;
                    break;
                case 'F': adicion += 10;
                    break;
            }    
        
            if (peso > 1 && peso <=2){

                adicion += 10;

            }else if(peso > 2 && peso <=3){

                adicion += 50;

            }else if(peso > 3 && peso <=4){

                adicion += 80;

            }else if(peso > 4){

                adicion +=100;

            }

            return precioBase + adicion;
        }

    }
    
    class Portatil extends Dispositivo{
        
        private final Integer DISCO_DURO_BASE = 250;
        private Integer discoDuro;
        
        public Portatil (){
            super();
            this.discoDuro = DISCO_DURO_BASE;
        }

        public Portatil (Double precioBase, Integer peso){
            
            super(precioBase, peso);
            this.discoDuro = DISCO_DURO_BASE;
        }

        public Portatil (Double precioBase, Integer peso, char consumoW, Integer discoDuro){

            super(precioBase, peso, consumoW);
            this.discoDuro = discoDuro;

        }


        public double calcularPrecio (){
        
            double adicion = 0d;

            if (discoDuro > 250 && discoDuro <= 500){

            adicion += 10;

            }else if (discoDuro > 500 && discoDuro <=1000){

            adicion += 50;

            }else if (discoDuro > 1000){

            adicion += 100;
            }

            return super.calcularPrecio() + adicion;
        }
        
        
    }
    
    class PrecioTotal {
    
        private double totalDispositivos;
        private double totalPortatiles;
        private double totalTablets;
        private Dispositivo[] listaDispositivos;

        public PrecioTotal (Dispositivo[] pDispositivos){

            totalDispositivos = 0d;
            totalPortatiles = 0d;
            totalTablets = 0d;
            listaDispositivos = pDispositivos; 
        }
    
        public void mostrarTotales (){
            
            for (Dispositivo i : listaDispositivos){

                totalDispositivos += i.calcularPrecio(); 
            
            if (i instanceof Tablet)

                totalTablets += i.calcularPrecio();
            
            else if (i instanceof Portatil)

                totalPortatiles += i.calcularPrecio();

            }


            System.out.println("La suma del precio de los Dispositivos es de " + totalDispositivos);
            System.out.println("La suma del precio de los Computadores portatiles es " + totalPortatiles);
            System.out.println("La suma del precio de las Tablets es de "+ totalTablets);
        }
    }
    
    class Tablet extends Dispositivo{
        
        private final Integer MEMORIA_RAM_BASE = 1;
        private Integer memoriaRam;
        
        public Tablet (){

            super();
            this.memoriaRam = MEMORIA_RAM_BASE;
        }

        public Tablet (Double precioBase, Integer peso){

            super(precioBase, peso);
            this.memoriaRam = MEMORIA_RAM_BASE;

        }

        public Tablet (Double precioBase, Integer peso, char consumoW, Integer memoriaRam){

            super(precioBase, peso, consumoW);
            this.memoriaRam = memoriaRam;
        }

        public double calcularPrecio (){
            
            double adicion = 0d;

            if (memoriaRam >1 && memoriaRam <=2){

                adicion += 5;

            }else if (memoriaRam >2 && memoriaRam <=4){

                adicion += 25;
            
            }else if (memoriaRam > 4){

                adicion += 50;
            } 

            return super.calcularPrecio() + adicion;
        }
        
    }

}
