public class TiketService {
        Tiket tikets[] = new Tiket[5];
        int tik;
    
        void tambah(Tiket msk){
           if(tik < tikets.length){
               tikets[tik] = msk;
               tik++;
           }
        }
    
        void tampilAll(){
            for(Tiket msk : tikets){
                msk.tampilAll();
            }
        }
    
        void bubbleSort(){
            for(int i=0; i<tikets.length; i++){
                for(int j=1; j<tikets.length; j++){
                    if(tikets[j].harga > tikets[j-1].harga){
                        //swap
                        Tiket swp = tikets[j];
                        tikets[j] = tikets[j-1];
                        tikets[j-1] = swp;
                    }
                }
            }
        }
    
        void selectionSort(){
            for(int i=0; i<tikets.length; i++){
                int idxMin = i;
                for(int j=i+1; j<tikets.length; j++){
                    if(tikets[j].harga < tikets[idxMin].harga){
                        idxMin = j;
                    }
    
                    Tiket swap = tikets[idxMin];
                    tikets[idxMin] = tikets[i];
                    tikets[i] = swap;
                }
            }
        }
    }

