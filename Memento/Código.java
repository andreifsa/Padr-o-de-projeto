import java.util.List;
import java.util.ArrayList;
class Originator {
    private String state;
    public void setState(String state) {
        System.out.println("Originator: Mudando estado para " + state);
        this.state = state;
    }
    public Memento saveState() {
        System.out.println("Originator: Salvando o Memento.");
        return new Memento(this.state);
    }
    public void restoreState(Memento memento) {
        this.state = memento.getSavedState();
        System.out.println("Originator: Estado após restaurar o Memento: " + state);
    }
    public static class Memento {
        private final String state;
        public Memento(String stateToSave) {
            this.state = stateToSave;
        }
        private String getSavedState() {
            return this.state;
        }
    }
}
class Armazenador {
    public static void main(String[] args) {
        List<Originator.Memento> savedStates = new ArrayList<>();
        Originator originator = new Originator();
        originator.setState("Estado1");
        originator.setState("Estado2");
        savedStates.add(originador.saveState());
        originator.setState("Estado3");
        // Podemos ter múltiplos mementos e escolher qual queremos restaurar.
        savedStates.add(originator.saveState());
        originator.set("Estado4");
        originador.restoreState(savedStates.get(1));
    }
}
