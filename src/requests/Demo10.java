package requests;

import java.util.List;
import java.util.Set;

//interface CollectionFactory<T> {
//    Set<T> setOf(T ts);
//    List<T> listOf(T ls);
//}

interface ListFactory<L> {
    List<L> listOf(L ls);
}

interface SetFactory<T> {
    Set<T> setOf(T ts);
}

class ListFactoryImpl<L> implements ListFactory<L> {
    @Override
    public List<L> listOf(L ls) {
        return List.of(ls);
    }
}

class SetFactoryImpl<S> implements SetFactory<S> {
    @Override
    public Set<S> setOf(S s) {
        return Set.of(s);
    }
}

public class Demo10 {
    private static <L> List<L> listOf(ListFactory<L> factory, L l) {
        return factory.listOf(l);
    }

    private static <S> Set<S> setOf(SetFactory<S> factory, S s) {
        return factory.setOf(s);
    }

    public static void main(String[] args) {
        Set<String> set = setOf(new SetFactoryImpl<>(), "hello");
        List<String> list = listOf(new ListFactoryImpl<>(), "world");
    }
}
