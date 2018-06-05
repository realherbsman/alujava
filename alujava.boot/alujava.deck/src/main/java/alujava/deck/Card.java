package alujava.deck;

/**
 * Интерфейс игральной карты
 * @author Yakim Tsikhanovich
 */
public interface Card {
	
	/**
	 * Для получения информации о карте
	 * @return масть карты
	 */
	public CardSuit getCardSuit();
	
	/**
	 * Для получения информации о карте
	 * @return достоинство карты
	 */
	public CardRank getCardRank();
	
	/**
	 * Для получения информации о карте
	 * @return строковое представление карты в формате</br>
	 * “{CardRank, CardSuit}”
	 */
	@Override
	public String toString();
}

