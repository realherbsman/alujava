package ts.yakim.ceramics;

import static ts.yakim.ceramics.Image.*;
import static ts.yakim.ceramics.Color.*;

public enum Tile {
	TILE_01(1, 8, LEAF, GREY_DARK),
	TILE_02(2, 1, LEAF, GREY_BOTH),
	TILE_03(3, 1, LEAF, DARK),
	TILE_04(4, 1, LEAF, GREY_DARK),
	TILE_05(5, 4, CIRCLE, GREY_DARK),
	TILE_06(6, 3, HALF_CIRCLE, GREY_BOTH),
	TILE_07(7, 2, CIRCLE, GREY_LIGHT),
	TILE_08(8, 1, TREE, DARK),
	TILE_09(9, 1, CIRCLE, GREY_DARK),
	TILE_10(10, 8, CIRCLE, GREY_BOTH),
	TILE_11(11, 2, TEXTURE, GREY_DARK),
	TILE_12(12, 5, TEXTURE, DARK),
	TILE_13(13, 4, TREE, DARK),
	TILE_14(14, 2, TREE, GREY_LIGHT),
	TILE_15(15, 1, HALF_CIRCLE, GREY_LIGHT),
	TILE_16(16, 1, CIRCLE, DARK),
	TILE_17(17, 7, TREE, GREY_BOTH),
	TILE_18(18, 7, TREE, GREY_BOTH),
	TILE_19(19, 1, CIRCLE, GREY_DARK),
	TILE_20(20, 3, TEXTURE, GREY_DARK),
	TILE_21(21, 1, TREE, DARK),
	TILE_22(22, 1, TREE, DARK),
	TILE_23(23, 4, HALF_CIRCLE, GREY_BOTH),
	TILE_24(24, 4, HALF_CIRCLE, DARK),
	TILE_25(25, 3, CIRCLE, GREY_BOTH),
	TILE_26(26, 2, CIRCLE, GREY_BOTH),
	TILE_27(27, 3, TEXTURE, GREY_DARK),
	TILE_28(28, 4, TEXTURE, DARK),
	TILE_29(29, 2, CIRCLE, GREY_LIGHT),
	TILE_30(30, 2, CIRCLE, GREY_BOTH),
	TILE_31(31, 6, TEXTURE, GREY_DARK),
	TILE_32(32, 3, TEXTURE, DARK),
	TILE_33(33, 2, HALF_CIRCLE, GREY_DARK),
	TILE_34(34, 4, TEXTURE, GREY_DARK);
	
	private final int code;
	private final int cnt;
	private final Image image;
	private final Color color;
	
	private Tile(int code, int cnt, Image image, Color color) {
		this.code = code;
		this.cnt = cnt;
		this.image = image;
		this.color = color;
	}
}
