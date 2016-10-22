
QUnit.test( "Running middleNumber tests:", function( assert ) {
    assert.ok(middleNumber(415,355)==273, "middleNumber(415, 355) = 273");
    assert.ok(middleNumber(43,25)==34, "middleNumber(43,25) = 34");
    assert.ok(middleNumber(57, 44)==-1, "middleNumber(57, 44)= -1");
    assert.ok(middleNumber(109, 101)==-1, "middleNumber(109, 101)= -1");
    assert.ok(middleNumber(66, 22)==44, "midleNumber(66, 22)= 44");
    assert.ok(middleNumber(23, 77)==-1,"middleNumber(23, 77)= -1");
    assert.ok(middleNumber(33, 47)==40, "middleNumber(33, 47)= 40");
    assert.ok(middleNumber(23, 44)==-1,"middleNumber(23, 44= -1");
});

function middleNumber(a, b){
    return -1;
}

