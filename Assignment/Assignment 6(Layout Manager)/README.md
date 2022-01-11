# BorderLayout (LayoutManagers)
## Java LayoutManagers
The LayoutManagers are used to arrange components in a particular manner. The Java LayoutManagers facilitates us to control the positioning and size of the components in GUI forms. LayoutManager is an interface that is implemented by all the classes of layout managers. There are the following classes that represent the layout managers:
1. java.awt.BorderLayout
2. java.awt.FlowLayout
3. java.awt.GridLayout
4. java.awt.CardLayout
5. java.awt.GridBagLayout
6. javax.swing.BoxLayout
7. javax.swing.GroupLayout
8. javax.swing.ScrollPaneLayout
9. javax.swing.SpringLayout etc.

## Java BorderLayout
The BorderLayout is used to arrange the components in five regions: north, south, east, west, and center. Each region (area) may contain one component only. It is the default layout of a frame or window. The BorderLayout provides five constants for each region:
1. public static final int NORTH
2. public static final int SOUTH
3. public static final int EAST
4. public static final int WEST
5. public static final int CENTER

### Constructors of BorderLayout class:
* BorderLayout(): creates a border layout but with no gaps between the components.
* BorderLayout(int hgap, int vgap): creates a border layout with the given horizontal and vertical gaps between the components.

## Java GridLayout
The Java GridLayout class is used to arrange the components in a rectangular grid. One component is displayed in each rectangle.

### Constructors of GridLayout class
* GridLayout(): creates a grid layout with one column per component in a row.
* GridLayout(int rows, int columns): creates a grid layout with the given rows and columns but no gaps between the components.
* GridLayout(int rows, int columns, int hgap, int vgap): creates a grid layout with the given rows and columns along with given horizontal and vertical gaps.

## Java FlowLayout
The Java FlowLayout class is used to arrange the components in a line, one after another (in a flow). It is the default layout of the applet or panel.

### Fields of FlowLayout class
1. public static final int LEFT
2. public static final int RIGHT
3. public static final int CENTER
4. public static final int LEADING
5. public static final int TRAILING

### Constructors of FlowLayout class
* FlowLayout(): creates a flow layout with centered alignment and a default 5 unit horizontal and vertical gap.
* FlowLayout(int align): creates a flow layout with the given alignment and a default 5 unit horizontal and vertical gap.
* FlowLayout(int align, int hgap, int vgap): creates a flow layout with the given alignment and the given horizontal and vertical gap.

## Java BoxLayout
The Java BoxLayout class is used to arrange the components either vertically or horizontally. For this purpose, the BoxLayout class provides four constants. They are as follows:
Note: The BoxLayout class is found in javax.swing package.

### Fields of BoxLayout Class
1. public static final int X_AXIS: Alignment of the components are horizontal from left to right.
2. public static final int Y_AXIS: Alignment of the components are vertical from top to bottom.
3. public static final int LINE_AXIS: Alignment of the components is similar to the way words are aligned in a line, which is based on the ComponentOrientation property of the container. If the ComponentOrientation property of the container is horizontal, then the components are aligned horizontally; otherwise, the components are aligned vertically. For horizontal orientations, we have two cases: left to right, and right to left. If the value ComponentOrientation property of the container is from left to right, then the components are rendered from left to right, and for right to left, the rendering of components is also from right to left. In the case of vertical orientations, the components are always rendered from top to bottom.
4. public static final int PAGE_AXIS: Alignment of the components is similar to the way text lines are put on a page, which is based on the ComponentOrientation property of the container. If the ComponentOrientation property of the container is horizontal, then components are aligned vertically; otherwise, the components are aligned horizontally. For horizontal orientations, we have two cases: left to right, and right to left. If the value ComponentOrientation property of the container is also from left to right, then the components are rendered from left to right, and for right to left, the rendering of components is from right to left. In the case of vertical orientations, the components are always rendered from top to bottom.

### Constructor of BoxLayout class
* BoxLayout(Container c, int axis): creates a box layout that arranges the components with the given axis.
