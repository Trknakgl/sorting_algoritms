public class Main {
    public static void main(String[] args) {
        int arrLenght = 100000;

        int mainArr[] = new int[arrLenght];
        for (int i = 0; i < arrLenght; i++) {
            mainArr[i] = i;
        }

        System.out.println("Array lenght :" + arrLenght);
        long startTime = System.currentTimeMillis();
        InsertionSort insertionSort = new InsertionSort(mainArr);
        long endTime = System.currentTimeMillis();
        long estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
        double seconds = (double) estimatedTime / 1000; // saniyeye çevirmek için 1000'e bölüyoruz.
        System.out.println("insertionSort");
        System.out.println("geçen süre milisaniye : " + estimatedTime);
        System.out.println("geçen süre saniye : " + seconds);

        startTime = System.currentTimeMillis();
        QuickSort quickSort = new QuickSort(mainArr, 0, mainArr.length - 1);
        endTime = System.currentTimeMillis();
        estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
        seconds = (double) estimatedTime / 1000; // saniyeye çevirmek için 1000'e bölüyoruz.
        System.out.println("quickSort");
        System.out.println("geçen süre milisaniye : " + estimatedTime);
        System.out.println("geçen süre saniye : " + seconds);

        startTime = System.currentTimeMillis();
        SelectionSort selectionSort = new SelectionSort(mainArr);
        endTime = System.currentTimeMillis();
        estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
        seconds = (double) estimatedTime / 1000; // saniyeye çevirmek için 1000'e bölüyoruz.
        System.out.println("selectionSort");
        System.out.println("geçen süre milisaniye : " + estimatedTime);
        System.out.println("geçen süre saniye : " + seconds);

        startTime = System.currentTimeMillis();
        CountingSort countingSort = new CountingSort(mainArr);
        endTime = System.currentTimeMillis();
        estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
        seconds = (double) estimatedTime / 1000; // saniyeye çevirmek için 1000'e bölüyoruz.
        System.out.println("countingSort");
        System.out.println("geçen süre milisaniye : " + estimatedTime);
        System.out.println("geçen süre saniye : " + seconds);

        startTime = System.currentTimeMillis();
        BubbleSort bubbleSort = new BubbleSort(mainArr);
        endTime = System.currentTimeMillis();
        estimatedTime = endTime - startTime; // Geçen süreyi milisaniye cinsinden elde ediyoruz
        seconds = (double) estimatedTime / 1000; // saniyeye çevirmek için 1000'e bölüyoruz.
        System.out.println("bubbleSort");
        System.out.println("geçen süre milisaniye : " + estimatedTime);
        System.out.println("geçen süre saniye : " + seconds);

    }
}