package betteragriculture.init;

import betteragriculture.util.Config.Options;

import com.mcmoddev.lib.material.MetalMaterial;
import com.mcmoddev.lib.material.MetalMaterial.MaterialType;

/**
 * This class initializes all of the materials in Modern Metals.
 *
 * @author Jasmine Iwanek
 *
 */
public class Materials4 extends com.mcmoddev.lib.init.Materials {

	/** Aluminum */
	/** Aluminum-Brass*/
	
	public static MetalMaterial tinyTileBlue;
	public static MetalMaterial tinyTileBrown;
	public static MetalMaterial tinyTileCyan;
	public static MetalMaterial tinyTileGreen;
	public static MetalMaterial tinyTileGrey;
	public static MetalMaterial tinyTileLightBlue;
	public static MetalMaterial tinyTileLightGrey;
	public static MetalMaterial tinyTileLime;
	public static MetalMaterial tinyTileMagenta;
	public static MetalMaterial tinyTileOrange;
	public static MetalMaterial tinyTilePink;
	public static MetalMaterial tinyTilePurple;
	public static MetalMaterial tinyTileRed;
	public static MetalMaterial tinyTileWhite;
	public static MetalMaterial tinyTileYellow;
	public static MetalMaterial tinyTileClay;
	public static MetalMaterial tinyTileConcrete;
	public static MetalMaterial tinyTileQuartz;
	public static MetalMaterial tinyTileSlate;

	public static MetalMaterial smallTile;
	public static MetalMaterial smallTileBlue;
	public static MetalMaterial smallTileBrown;
	public static MetalMaterial smallTileCyan;
	public static MetalMaterial smallTileGreen;
	public static MetalMaterial smallTileGrey;
	public static MetalMaterial smallTileLightBlue;
	public static MetalMaterial smallTileLightGrey;
	public static MetalMaterial smallTileLime;
	public static MetalMaterial smallTileMagenta;
	public static MetalMaterial smallTileOrange;
	public static MetalMaterial smallTilePink;
	public static MetalMaterial smallTilePurple;
	public static MetalMaterial smallTileRed;
	public static MetalMaterial smallTileWhite;
	public static MetalMaterial smallTileYellow;
	public static MetalMaterial smallTileClay;
	public static MetalMaterial smallTileConcrete;
	public static MetalMaterial smallTileQuartz;
	public static MetalMaterial smallTileSlate;

	
	/** Chromium */
	public static MetalMaterial largeTile;

	public static MetalMaterial largeTileBlue;
	public static MetalMaterial largeTileBrown;
	public static MetalMaterial largeTileCyan;
	public static MetalMaterial largeTileGreen;
	public static MetalMaterial largeTileGrey;
	public static MetalMaterial largeTileLightBlue;
	public static MetalMaterial largeTileLightGrey;
	public static MetalMaterial largeTileLime;
	public static MetalMaterial largeTileMagenta;
	public static MetalMaterial largeTileOrange;
	public static MetalMaterial largeTilePink;
	public static MetalMaterial largeTilePurple;
	public static MetalMaterial largeTileRed;
	public static MetalMaterial largeTileWhite;
	public static MetalMaterial largeTileYellow;
	public static MetalMaterial largeTileClay;
	public static MetalMaterial largeTileConcrete;
	public static MetalMaterial largeTileQuartz;
	public static MetalMaterial largeTileSlate;
	/** Magnesium */
	public static MetalMaterial slate;
	/** Nichrome */
	/** Magnesium */
	public static MetalMaterial brick;
	
	public static MetalMaterial concrete;
	/** Nichrome */
	public static MetalMaterial sidingRed;
	/** Nichrome */
	public static MetalMaterial sidingWhite;
	/** Nichrome */
	public static MetalMaterial stockTankAccacia;
	public static MetalMaterial stockTankBirch;
	public static MetalMaterial stockTankDarkOak;
	public static MetalMaterial stockTankJungle;
	public static MetalMaterial stockTankOak;
	public static MetalMaterial stockTankSpruce;
	public static MetalMaterial stockTankStone;







	private static boolean initDone = false;

	protected Materials4() {
		throw new IllegalAccessError("Not a instantiable class");
	}

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		if (Options.enableTinyTile) {
			tinyTileBlue = createMaterial("tinytileblue_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileBrown = createMaterial("tinytilebrown_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileCyan = createMaterial("tinytilecyan_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileGreen = createMaterial("tinytilegreen_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileGrey = createMaterial("tinytilegrey_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileLightBlue = createMaterial("tinytilelightblue_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileLightGrey = createMaterial("tinytileLightgrey_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileLime = createMaterial("tinytilelime_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileMagenta = createMaterial("tinytilemagenta_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileOrange = createMaterial("tinytileorange_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTilePink = createMaterial("tinytilepink_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTilePurple = createMaterial("tinytilepurple_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileRed = createMaterial("tinytilered_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileWhite = createMaterial("tinytilewhite_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileClay = createMaterial("tinytileclay_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileConcrete = createMaterial("tinytileconcrete_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileQuartz = createMaterial("tinytilequartz_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			tinyTileSlate = createMaterial("tinytileslate_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);

		}

		/////
		if (Options.enableSmallTile) {
			smallTileBlue = createMaterial("smalltile_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileBrown = createMaterial("smalltilebrown_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileCyan = createMaterial("smalltilecyan_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileGreen = createMaterial("smalltilegreen_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileGrey = createMaterial("smalltilegrey_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileLightBlue = createMaterial("smalltilelightblue_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileLightGrey = createMaterial("smalltileLightgrey_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileLime = createMaterial("smalltilelime_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileMagenta = createMaterial("smalltilemagenta_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileOrange = createMaterial("smalltileorange_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTilePink = createMaterial("smalltilepink_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTilePurple = createMaterial("smalltilepurple_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileRed = createMaterial("smalltilered_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileWhite = createMaterial("smalltilewhite_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileClay = createMaterial("smalltileclay_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileQuartz = createMaterial("smalltilequartz_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileConcrete = createMaterial("smalltileconcrete_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			smallTileSlate = createMaterial("smalltileslate_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
		}

		////
		if (Options.enableLargeTile) {
			largeTileBlue = createMaterial("largetile_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileBrown = createMaterial("largetilebrown_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileCyan = createMaterial("largetilecyan_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileGreen = createMaterial("largetilegreen_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileGrey = createMaterial("largetilegrey_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileLightBlue = createMaterial("largetilelightblue_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileLightGrey = createMaterial("largetileLightgrey_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileLime = createMaterial("largetilelime_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileMagenta = createMaterial("largetilemagenta_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileOrange = createMaterial("largetileorange_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTilePink = createMaterial("largetilepink_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTilePurple = createMaterial("largetilepurple_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileRed = createMaterial("largetilered_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileWhite = createMaterial("largetilewhite_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileClay = createMaterial("largetileclay_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileConcrete = createMaterial("largetileconcrete_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileQuartz = createMaterial("largetilequartz_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
			largeTileSlate = createMaterial("largetileslate_slab", MaterialType.METAL, 1, 7.5, 4.5, 0xFFEBAA56);
		}

		
		/////

		if (Options.enableSlate) {
			slate = createMaterial("slate_slab", MaterialType.METAL, 9, 3, 4.5, 0xFFCDCDCF);
		}

		if (Options.enableSlate) {
			concrete = createMaterial("concrete_slab", MaterialType.METAL, 9, 3, 4.5, 0xFFCDCDCF);
		}	



		initDone = true;
	}
}
