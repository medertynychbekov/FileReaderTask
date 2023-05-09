public enum Region {
    CHUI{
        @Override
        public void ozgocholugu() {
            System.out.println("Burana");
        }
    },
    TALAS {
        @Override
        public void ozgocholugu() {
            System.out.println("Manastyn kumbozy");
        }
    },
    YSSYK_KOL {
        @Override
        public void ozgocholugu() {
            System.out.println("Kol");
        }
    },
    NARYN {
        @Override
        public void ozgocholugu() {
            System.out.println("Tash-Rabat");
        }
    },
    ZHALAL_ABAD {
        @Override
        public void ozgocholugu() {
            System.out.println("Arslanbab");
        }
    },
    OSH {
        @Override
        public void ozgocholugu() {
            System.out.println("Sulaiman-Too");
        }
    },
    BATKEN {
        @Override
        public void ozgocholugu() {
            System.out.println("Aigul gulu");
        }
    };
    public abstract void ozgocholugu();

}
