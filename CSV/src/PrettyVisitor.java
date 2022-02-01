public class PrettyVisitor extends csvBaseVisitor<String> {


    @Override
    public String visitList(csvParser.ListContext ctx) {
        return ctx.elems() == null ? "" : "[ " + this.visitElems(ctx.elems()) + " ]";
    }

    @Override
    public String visitElems(csvParser.ElemsContext ctx) {
        String str = this.visitElem(ctx.elem().get(0));
        for (int i = 1; i < ctx.elem().size(); i++) {
            str += ", " + this.visitElem(ctx.elem().get(i));
        }
        return str;
    }

    @Override
    public String visitElem(csvParser.ElemContext ctx) {
        return ctx.getText();
    }
}
