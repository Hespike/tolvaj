public class Tolvaj {

    static boolean koSzamlalas(int lefoglaltKovek, int[] bejelentettKoEltunesek) {
        int bejelentett = 0;
        for (int i = 0; bejelentettKoEltunesek.length > i; i++) {
            bejelentett = bejelentett + bejelentettKoEltunesek[i];
        }

        if (lefoglaltKovek >= bejelentett) {
            return true;
        } else {
            return false;
        }
    }
}



/*also
public class Tolvaj {

    static boolean koSzamlalas(int lefoglaltKovek, int[] bejelentettKoEltunesek) {
        int bejelentett = 0;
        for (int i = 0; i < bejelentettKoEltunesek.length; i++) {
            bejelentett += bejelentettKoEltunesek[i];
        }

        return bejelentett <= lefoglaltKovek;
    }

}
